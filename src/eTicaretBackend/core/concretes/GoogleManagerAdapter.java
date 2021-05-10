package eTicaretBackend.core.concretes;

import eTicaretBackend.core.abstracts.RegisterService;
import eTicaretBackend.googleRegister.GoogleManager;

public class GoogleManagerAdapter implements RegisterService {


	@Override
	public void registerWith() {
		
	GoogleManager googleManager = new GoogleManager();
	googleManager.register();
		
	}
	

}
