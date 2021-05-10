package eTicaretBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretBackend.dataAccess.abstracts.UserDao;
import eTicaretBackend.entities.concretes.User;

public class DataBaseUserDao implements UserDao{

	private List<User> users;
	
	
	
	public DataBaseUserDao() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getName()+" "+user.getSurname()+" "+"is added to the system successfully");
		
	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<User> getAll() {
		
		return this.users;
	}
	

}
