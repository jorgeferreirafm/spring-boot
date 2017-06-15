package io.github.jffm.springboot.ext.hbase.model.repository;

import java.io.IOException;
import java.util.List;

import io.github.jffm.springboot.ext.hbase.model.serializer.SerializationException;

public interface IHBaseRepository<D> {
	
	public D get(byte[] key) throws IOException, SerializationException;
	
	public void delete(byte[] key) throws IOException;
	
	public D getVersion(byte[] key, long version) throws IOException;
	
	public long save (byte[] keys, D object) throws IOException, SerializationException;
	
	public List<D> query () throws IOException, SerializationException;

}
