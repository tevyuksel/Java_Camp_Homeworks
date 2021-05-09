package userOperations.dataAccess.abstracts;

import java.util.List;

import userOperations.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);	
	User getId(int id);
	User getMail(String email);
	List<User> getAll();

}
