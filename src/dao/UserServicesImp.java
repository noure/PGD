/**
 * 
 */
package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import beans.User;

/**
 * @author noureddine
 * 
 */
public class UserServicesImp implements UserServicesInter {

	@SessionTarget
	Session session;
	@TransactionTarget
	Transaction transaction;

	@Override
	public void addUser(User user) {
		session.save(user);

	}

	@Override
	public void deletUser(String cniuser) {
		session.createQuery("DELET FROM USER as U WHERE D.cniuser=" + cniuser);

	}

	@Override
	public String verify(String cniuser, String pwd) {
		Query query = (Query) session
				.createQuery("SELECT FROM USER AS u WHERE u.cniUser=" + cniuser
						+ "AND u.pwdUser=" + pwd);
		List<User> listuser = query.getResultList();
		if (listuser.isEmpty())
			return "badlogin";
		else
			return "goodlogin";

	}

	@Override
	public List<User> showUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
