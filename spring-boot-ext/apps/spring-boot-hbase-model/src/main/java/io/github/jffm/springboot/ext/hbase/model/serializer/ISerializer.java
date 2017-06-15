package io.github.jffm.springboot.ext.hbase.model.serializer;

public interface ISerializer {

	public byte[] serialize (Object value) throws SerializationException;
	
	public Object deserialize (byte[] value) throws SerializationException;
	
	public String getFormat();
	
	public long getVersion();
	
}
