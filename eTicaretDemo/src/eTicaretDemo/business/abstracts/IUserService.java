package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface IUserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User>getAll();
	void login(User user);

}
