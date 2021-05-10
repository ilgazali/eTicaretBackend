package eTicaretBackend.business.concretes;


import eTicaretBackend.business.abstracts.UserService;
import eTicaretBackend.business.abstracts.ValidityService;
import eTicaretBackend.business.abstracts.VerificationService;
import eTicaretBackend.core.abstracts.RegisterService;
import eTicaretBackend.dataAccess.abstracts.UserDao;
import eTicaretBackend.entities.concretes.User;

public class UserManager implements UserService{
	

	private VerificationService verificationService;
	private UserDao userDao;
	private RegisterService registerService;
	
	public UserManager(VerificationService verificationService, UserDao userDao,
			RegisterService registerService) {
		super();

		this.verificationService = verificationService;
		this.userDao = userDao;
		this.registerService = registerService;
	}

	@Override
	public void register(User user) {
		
		ValidityService validityService = new ValidityManager(userDao);
		
	if (verificationService.userEmailCheck(user.getEmail())
		&& validityService.isValid(user.getEmail())
		&& verificationService.userNameCheck(user.getName())
		&& verificationService.userSurnameCheck(user.getSurname())
		&& verificationService.userPasswordCheck(user.getPassword())
		) {
		
		userDao.add(user);
        registerService.registerWith();
        
		System.out.println("Registration Successful");
		System.out.println("Verification code is sent to your email address-->" + user.getEmail() );
		System.out.println("");
	    System.out.println("Total user : "+userDao.getAll().size());
		System.out.println("###########################################################");
	
	}
		
	}

	@Override
	public void signIn(String email, String password) {
     
		for(int i = 0; i < userDao.getAll().size(); i++){
			
			if (userDao.getAll().get(i).getEmail().equals(email)
					&& userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("you entered to the system successfully.");
				return;
			}
			
			System.out.println("email or password is invalid");
			
			
		}
		
	}
	
	
	
	
	
	

}
