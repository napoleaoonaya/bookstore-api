package br.com.onaya.bookstore.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5503485023359926716L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}
	
	

}
