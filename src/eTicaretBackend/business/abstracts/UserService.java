package eTicaretBackend.business.abstracts;

import eTicaretBackend.entities.concretes.User;

public interface UserService {

	void register(User user);
	void signIn(String email, String password);
	
}
