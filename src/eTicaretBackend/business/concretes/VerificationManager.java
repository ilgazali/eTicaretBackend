package eTicaretBackend.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretBackend.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public boolean userNameCheck(String username) {
	
		if(username.length()>2) {
			
			return true; 
			
		}
		else {
			System.out.println("Name characters musn't be less than 2");
			return false;
		}
					
	}

	@Override
	public boolean userSurnameCheck(String surname) {
		
	if(surname.length()>2) {
			
			return true; 
			
		}
		else {
			System.out.println("ERROR: Surname characters musn't be less than 2");
			return false;
		}
	}

	@Override
	public boolean userEmailCheck(String email) {
		

	        java.util.regex.Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);

	        if(matcher.matches()) {
	            return true;
	        }else if(email.isEmpty()){
	        	System.out.println("ERROR: you must enter your email");
	        	return false;
	        }else {
	        	System.out.println("ERROR: you entered an invalid email");
	            return false;
	        }
	        
	}

	@Override
	public boolean userPasswordCheck(String password) {
 
		if(password.length() >= 6) {
			return true;
		}else if(password.isEmpty()){
			System.out.println("ERROR: you must enter your password");
			return false;
		}else {
			System.out.println("ERROR: your password is less than 6");
			return false;
		}
	}
	
	

}
