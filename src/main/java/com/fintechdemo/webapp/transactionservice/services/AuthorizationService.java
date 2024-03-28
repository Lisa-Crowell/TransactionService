package com.fintechdemo.webapp.transactionservice.services;

import com.fintechdemo.webapp.transactionservice.dtos.UserDTO;

/**
 * The interface Authorization service.
 *
 * @author Lisa Crowell <lisa.l.crowell@gmail.com>
 */
public interface AuthorizationService {
	/**
	 * Gets user by user id.
	 *
	 * @param id the id
	 * @return the user by user id
	 */
	UserDTO getUserByUserId(String id);
}
