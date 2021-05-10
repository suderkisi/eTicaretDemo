package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.IEmailCheckService;
import eTicaretDemo.entities.concretes.User;

public class EmailCheckManager implements IEmailCheckService{

	public void control(User user) {
		System.out.println("Do�rulama e-postas� g�nderilmi�tir. L�tfen linke t�klay�n�z.");
	}

}
