package com.fintechdemo.webapp.transactionservice.repositories;

import com.fintechdemo.webapp.transactionservice.entities.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionStatusRepository extends JpaRepository<TransactionStatus, String> {

	Optional<TransactionStatus> findByStatusName(String statusName);
}
