package eTicaretDemo.core;

import eTicaretDemo.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void signToGoogle(String message) {
		GoogleManager manager=new GoogleManager();
		manager.signToGoogle(message);
	}

}
