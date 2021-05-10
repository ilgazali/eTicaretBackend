package eTicaretBackend.business.concretes;


import eTicaretBackend.business.abstracts.ValidityService;
import eTicaretBackend.dataAccess.abstracts.UserDao;
import eTicaretBackend.entities.concretes.User;

public class ValidityManager implements ValidityService{

	private UserDao userDao;
	
	



	public ValidityManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}





	@Override
	public boolean isValid(String email){
		
		for(User user : userDao.getAll()) {
			if(email.equals(user.getEmail())) {
				System.out.println("Email adresi zaten kayitli!.");
				return false;
			}
		}
		return true;
	}

}
