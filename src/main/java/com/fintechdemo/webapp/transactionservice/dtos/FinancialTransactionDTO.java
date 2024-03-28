package com.fintechdemo.webapp.transactionservice.dtos;

import com.fintechdemo.webapp.transactionservice.entities.CurrencyValue;
import com.fintechdemo.webapp.transactionservice.entities.FinancialAsset;
import com.fintechdemo.webapp.transactionservice.entities.TransactionStatus;
import com.fintechdemo.webapp.transactionservice.entities.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * This is the Data Transfer Object for Financial Transactions.
 *
 * @author lisa.l.crowell@gmail.com
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FinancialTransactionDTO {
	String id;
	CurrencyValue transactionAmount;
	TransactionStatus transactionStatus;
	FinancialAsset source;
	FinancialAsset target;
	TransactionType transactionType;
	String notes;
	LocalDateTime statusTime;
}
