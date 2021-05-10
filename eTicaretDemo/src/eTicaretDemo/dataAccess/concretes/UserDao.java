package eTicaretDemo.dataAccess.concretes;

import java.util.List;

import eTicaretDemo.dataAccess.abstracts.IUserDao;
import eTicaretDemo.entities.concretes.User;

public class UserDao implements IUserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getName()+user.getLastName()+"adlý kullanýcý sisteme eklendi.");
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public User getAll(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
