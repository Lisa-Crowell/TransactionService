package com.fintechdemo.webapp.transactionservice.repositories;

import com.fintechdemo.webapp.transactionservice.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface UserEntity repository.
 *
 * @author Lisa Crowell <lisa.l.crowell@gmail.com>
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	/**
	 * Find by email user entity.
	 *
	 * @param s the s
	 * @return the user entity
	 */
	UserEntity findByEmail(String s);

	/**
	 * Find a user entity by phone number
	 *
	 * @param s String phone number
	 * @return UserEntity user entity
	 */
	UserEntity findByPhone(String s);

	/**
	 * Find a user entity by username.
	 *
	 * @param s String username
	 * @return the user entity
	 */
	UserEntity findByUsername(String s);
}
