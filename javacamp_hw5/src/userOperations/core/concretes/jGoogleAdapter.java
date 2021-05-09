package userOperations.core.concretes;

import userOperations.core.abstracts.jOutsideServices;
import userOperations.jGoogle.jGoogleManager;

public class jGoogleAdapter implements jOutsideServices{

	@Override
	public void registerWith() {
        jGoogleManager jGoogleManager = new jGoogleManager();
        jGoogleManager.register();
	}

	@Override
	public void loginWith() {
		jGoogleManager jGoogleManager = new jGoogleManager();
        jGoogleManager.login();	
	}
}
