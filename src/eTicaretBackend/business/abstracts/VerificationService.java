package eTicaretBackend.business.abstracts;

public interface VerificationService {

	boolean userNameCheck(String username);
	boolean userSurnameCheck(String surname);
	boolean userEmailCheck(String email);
	boolean userPasswordCheck(String password);
	
	
}
