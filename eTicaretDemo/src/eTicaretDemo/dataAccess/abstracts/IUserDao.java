package eTicaretDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface IUserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getAll(int id);
	List<User>getAll();
}
