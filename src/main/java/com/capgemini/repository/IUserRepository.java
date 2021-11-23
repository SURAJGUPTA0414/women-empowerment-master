package com.capgemini.repository;

import com.capgemini.model.User;

public interface IUserRepository {
	User registerUser(User user);

	User login(String username, String password);

	User forgotPassword(User user);

}