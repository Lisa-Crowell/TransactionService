package com.fintechdemo.webapp.transactionservice.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This class represents transactions related to a FinTechDemo loan.
 *
 * @author lisa.l.crowell@gmail.com
 */
@Entity
@Table(name = "loan_transactions")
public class LoanTransaction extends FinancialTransaction {
	private static final long serialVersionUID = -5512962618888107437L;
}
