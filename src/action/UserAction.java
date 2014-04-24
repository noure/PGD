/**
 * 
 */
package action;

import beans.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserServicesImp;

/**
 * @author noureddine
 * 
 */
public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private UserServicesImp usermanager;

	public UserAction() {
		usermanager = new UserServicesImp();
	}

	public String adduser(User _user) {
		usermanager.addUser(_user);

		return "success";

	}

	public String execute() {
		return "succes";

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String verify(String cniUser, String pwd) {

		return usermanager.verify(cniUser, pwd);
	}

}
