package com.fintechdemo.webapp.transactionservice.advisors;

import com.fintechdemo.webapp.transactionservice.exceptions.IncorrectTransactionSpecializationException;
import com.fintechdemo.webapp.transactionservice.exceptions.TransactionNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class TransactionControllerAdvisor extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> handleIncorrectTransactionSpecializationException(IncorrectTransactionSpecializationException e, WebRequest request){
		log.warn(String.format("Encountered incorrect transaction specialization exception in %s", request.toString()));

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", e.getMessage());

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<Object> handleTransactionNotfoundException(TransactionNotFoundException e,
																	 WebRequest request){
		log.warn(String.format("Encountered transaction not found exception in %s",
				request.toString()));

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", e.getMessage());

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
}
