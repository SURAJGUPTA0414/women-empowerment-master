package com.capgemini.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(FeedBackAlreadyExistsException.class)
	public ResponseEntity<Object> handleFeedBackAlreadyExistsException() {
		LOG.error("handleFeedBackAlreadyExistsExceptio");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "feedback is already exists.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.BAD_REQUEST);
	}
	
	//-----------------------------------------------------------------------------------------------
	
	@ExceptionHandler(FeedBackNotFoundException.class)
	public ResponseEntity<Object> handleFeedBackNotFoundException() {
		LOG.error("handleFeedBackNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "feedback not found.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
}