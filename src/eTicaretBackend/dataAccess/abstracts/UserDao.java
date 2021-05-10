package eTicaretBackend.dataAccess.abstracts;

import java.util.List;

import eTicaretBackend.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void edit(User user);
	void delete(User user);
	List<User> getAll();
}
