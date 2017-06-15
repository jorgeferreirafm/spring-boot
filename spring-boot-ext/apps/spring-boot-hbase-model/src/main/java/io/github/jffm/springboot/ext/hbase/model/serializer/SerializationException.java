package io.github.jffm.springboot.ext.hbase.model.serializer;

public class SerializationException extends Exception{
	
	public SerializationException() {
		super();
	}
	
	public SerializationException(Throwable throwable) {
		super(throwable);
	}
	
	public SerializationException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public SerializationException(String message) {
		super(message);
	}

}
