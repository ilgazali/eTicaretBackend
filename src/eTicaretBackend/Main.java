package eTicaretBackend;


import eTicaretBackend.business.abstracts.UserService;
import eTicaretBackend.business.abstracts.ValidityService;
import eTicaretBackend.business.concretes.UserManager;
import eTicaretBackend.business.concretes.ValidityManager;
import eTicaretBackend.business.concretes.VerificationManager;
import eTicaretBackend.core.abstracts.RegisterService;
import eTicaretBackend.core.concretes.GoogleManagerAdapter;
import eTicaretBackend.core.concretes.NoAdapter;
import eTicaretBackend.dataAccess.abstracts.UserDao;
import eTicaretBackend.dataAccess.concretes.DataBaseUserDao;
import eTicaretBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args){
		
		
		 UserManager userManager = new UserManager(new VerificationManager(),new DataBaseUserDao(),new NoAdapter());
		
     User user1 = new User("Muhammet Ali","ILGAZ","ilgazalii@gmail.com","125356");

		userManager.register(user1);
		userManager.signIn(user1.getEmail(), user1.getPassword());
		
		System.out.println("\n\n");
		
		
		 UserManager userManager2 = new UserManager(new VerificationManager(),new DataBaseUserDao(),new GoogleManagerAdapter());
		 
    User user2 = new User("Ali","ILGAZ","isdfgs@gmail.com","125356");	
    
		userManager2.register(user2);
		userManager2.signIn(user2.getEmail(), user2.getPassword());
		

	
		
		

	}


}
