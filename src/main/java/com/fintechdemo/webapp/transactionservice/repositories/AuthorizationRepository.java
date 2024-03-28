package com.fintechdemo.webapp.transactionservice.repositories;

import com.fintechdemo.webapp.transactionservice.entities.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * The interface Authorization repository.
 *
 * @author Lisa Crowell <lisa.l.crowell@gmail.com>
 */
@org.springframework.stereotype.Repository
public interface AuthorizationRepository extends Repository<UserEntity, String> {
	/**
	 * Find by user id optional.
	 *
	 * @param id the id
	 * @return the optional
	 */
	Optional<UserEntity> findById(String id);
}
