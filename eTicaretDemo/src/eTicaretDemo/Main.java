package eTicaretDemo;
import eTicaretDemo.business.abstracts.IUserService;
import eTicaretDemo.business.abstracts.IEmailCheckService;
import eTicaretDemo.business.concretes.EmailCheckManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.GoogleManagerAdapter;
import eTicaretDemo.core.GoogleService;
import eTicaretDemo.dataAccess.concretes.UserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
	IUserService �UserService = new UserManager(new EmailCheckManager(), new UserDao(), new GoogleManagerAdapter());
		
	User user = new User(1,"Sude","Erki�i","suderkisi@gmail.com","123456");
	
	IEmailCheckService �EmailCheckService=new EmailCheckManager();
	�EmailCheckService.control(user);
	
	�UserService.add(user);
	�UserService.login(user);
	
	
	
	
	

	

	
	


 }
}
