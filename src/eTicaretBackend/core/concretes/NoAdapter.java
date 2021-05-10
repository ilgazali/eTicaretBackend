package eTicaretBackend.core.concretes;

import eTicaretBackend.core.abstracts.RegisterService;

public class NoAdapter implements RegisterService {

	@Override
	public void registerWith() {
	 System.out.println("You registered normally");
		
	}

}
