package io.github.jffm.springboot.ext.hbase.model.serializer;

import org.apache.avro.Schema;
import org.apache.hadoop.io.serializer.avro.AvroReflectSerializable;
import org.apache.hadoop.io.serializer.avro.AvroReflectSerialization;
import org.springframework.stereotype.Component;

import io.github.jffm.springboot.ext.hbase.model.repository.avro.User;
import io.github.jffm.springboot.ext.hbase.model.serializer.avro.AvroReflectSerializer;
import io.github.jffm.springboot.ext.hbase.model.serializer.avro.AvroSerializer;


public class SerializationFacory {

	public ISerializer getSerializer(Class type,String format, long version, Object...args){
		if( format.equals(AvroReflectSerializer.NAME)){
			return new AvroReflectSerializer(type);
		}
		return new AvroSerializer(type, (Schema)args[0]);
	}
	
}
