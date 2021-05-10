package eTicaretDemo.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.IUserService;
import eTicaretDemo.core.GoogleService;
import eTicaretDemo.dataAccess.abstracts.IUserDao;
import eTicaretDemo.dataAccess.concretes.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements IUserService {
	
	private User user;
	private IUserDao ýUserDao;
	private GoogleService googleService;
	

	private EmailCheckManager emailCheckManager;

	public UserManager(EmailCheckManager emailCheckManager,IUserDao ýUserDao,GoogleService googleService) {
		super();
		this.emailCheckManager = emailCheckManager;
		this.ýUserDao = ýUserDao;
		this.googleService=googleService;
		
	}


	@Override
	public void add(User user) {
		if(user.getName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr.");
			
		}else {
			System.out.println("Ad ve soyad geçerli.");
			System.out.println(user.getName() +"  "+ user.getLastName()+"  "+ "adlý kullanýcý sisteme eklendi.");
			this.googleService.signToGoogle(user.getName() +"  "+ user.getLastName()+"  "+ "adlý kullanýcý Google ile eklendi.");
		}
		
		if(user.getParola().length()<6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
		}else {
			System.out.println("Geçerli parola.");
		}
			
	}
	@Override
	public void delete(User user) {
		
		
	}
	@Override
	public void update(User user) {
		
		
	}
	@Override
	public List<User> getAll() {
		return null;
	}
	@Override
	public void login(User user) {
			String regex = "suderkisi@gmail";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(user.getEposta());
		
			if(matcher.find()) {
		         System.out.println("Geçerli e-posta.");
		      } else {
		         System.out.println("Geçersiz e-posta.");
		      }
		}
}

		
	

	
