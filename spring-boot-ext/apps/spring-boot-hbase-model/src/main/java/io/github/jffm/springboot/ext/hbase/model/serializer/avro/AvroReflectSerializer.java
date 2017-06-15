package io.github.jffm.springboot.ext.hbase.model.serializer.avro;

import java.io.ByteArrayOutputStream;

import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.reflect.ReflectDatumReader;
import org.apache.avro.reflect.ReflectDatumWriter;

import io.github.jffm.springboot.ext.hbase.model.serializer.ISerializer;
import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationException;

public class AvroReflectSerializer implements ISerializer{
	
	public static final String NAME = "AVRO-Reflection";
	
	private Class type;
	
	public AvroReflectSerializer(Class type) {
		this.type = type;
	}
	
	@Override
	public byte[] serialize(Object value) throws SerializationException{		
		try{
			ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
			
			DatumWriter userDatumWriter = new ReflectDatumWriter(value.getClass());
			userDatumWriter.write(value, EncoderFactory.get().directBinaryEncoder(arrayOutputStream, null));
			
			return arrayOutputStream.toByteArray();
		}catch (Exception e) {
			throw new SerializationException(e);
		}
	}

	@Override
	public Object deserialize(byte[] value) throws SerializationException{
		try{
			
			ReflectDatumReader<Object> reader = new ReflectDatumReader<Object>(type);
			  Object after =
			    reader.read(null,
			                DecoderFactory.get().binaryDecoder(value, null));
			  return after;
		}catch (Exception e) {
			throw new SerializationException(e);
		}
	}

	@Override
	public String getFormat() {
		return NAME;
	}

	@Override
	public long getVersion() {
		return 0;
	}

}
