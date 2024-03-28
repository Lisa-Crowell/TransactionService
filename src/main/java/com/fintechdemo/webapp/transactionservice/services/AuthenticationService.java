package com.fintechdemo.webapp.transactionservice.services;

import com.fintechdemo.webapp.transactionservice.dtos.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * The interface Authentication service.
 *
 * @author Lisa Crowell <lisa.l.crowell@gmail.com>
 */
public interface AuthenticationService extends UserDetailsService {
	/**
	 * Gets user details by email.
	 *
	 * @param email the email
	 * @return the user details by email
	 */
	UserDTO getUserDetailsByEmail(String email);
}