package dao;

import java.util.List;

import beans.User;

public interface UserServicesInter {

	void addUser(User user);
	void deletUser(String cniuser) ;
	String verify(String userlogin, String pwd);
	List<User> showUsers();
}
