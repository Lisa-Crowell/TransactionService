package com.fintechdemo.webapp.transactionservice.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class TransactionNotFoundExceptionTest {
	@Test
	void testConstructor() {
		TransactionNotFoundException actualTransactionNotFoundException = new TransactionNotFoundException("Msg");
		assertNull(actualTransactionNotFoundException.getCause());
		assertEquals("exceptions.com.fintechdemo.webapp.transactionservice.TransactionNotFoundException: Msg",
				actualTransactionNotFoundException.toString());
		assertEquals(0, actualTransactionNotFoundException.getSuppressed().length);
		assertEquals("Msg", actualTransactionNotFoundException.getMessage());
		assertEquals("Msg", actualTransactionNotFoundException.getLocalizedMessage());
	}
}

