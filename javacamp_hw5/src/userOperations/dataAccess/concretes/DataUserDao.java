package userOperations.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import userOperations.dataAccess.abstracts.UserDao;
import userOperations.entities.concretes.User;

public class DataUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();
	
	@Override	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi -> " + user.getFirstName() + "! Email -> " + user.getEmail());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi -> " + user.getFirstName());		
	}
	
	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi -> " + user.getFirstName());		
	}

	@Override
	public User getId(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null; 
	}

	@Override
	public User getMail(String email) {
		for(User user:users) {
			if(user.getEmail()==email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
