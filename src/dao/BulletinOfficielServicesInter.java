/**
 * Class défini les services d'un bultin officiel 
 */
package dao;

import java.util.*;



import beans.*;

/**
 * @author noureddine
 *
 */

  public interface BulletinOfficielServicesInter {
	
	
	
	void addBO(Document document);
	void deletBO(int id);
	List<Document> findBOByMotCle(MotCle motcle);
	List<Document> findBOById(int id);
	List<Document> findBOByDateMiseAjout(Date datemiseajour);
	

}
