package br.com.onaya.bookstore.exceptions;

public class StandardError {

	private Long timestamp;
	private Integer status;
	private String error;
	
	public StandardError() {
		super();
	}
	
	public StandardError(Long timestamp, Integer status, String error) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
	}

	public Long getTimeStamp() {
		return timestamp;
	}

	public void setTimeStamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
