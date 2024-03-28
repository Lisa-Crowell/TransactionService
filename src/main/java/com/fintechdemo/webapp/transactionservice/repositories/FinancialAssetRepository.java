package com.fintechdemo.webapp.transactionservice.repositories;

import com.fintechdemo.webapp.transactionservice.entities.FinancialAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialAssetRepository extends JpaRepository<FinancialAsset, String> {
}
