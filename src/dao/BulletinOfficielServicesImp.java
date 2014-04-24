package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

import beans.Document;
//import beans.History;
import beans.MotCle;
//import beans.Repertory;

public class BulletinOfficielServicesImp implements
		BulletinOfficielServicesInter {

	@SessionTarget
	Session session;
	@TransactionTarget
	Transaction transaction;

	@Override
	public void addBO(Document document) {
		// document=new Document(123,new History(5),new Repertory(6) );
		session.save(document);
	}

	@Override
	public void deletBO(int idDocument) {

		session.createQuery("DELET FROM Document as D WHERE D.idDocument="
				+ idDocument);
	}

	@Override
	public List<Document> findBOByMotCle(MotCle motcle) {

		@SuppressWarnings("unchecked")
		List<Document> listDocument = session.createQuery(
				"SELECT document FROM MotCle AS m where m.libelle=" + motcle)
				.list();
		return listDocument;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Document> findBOById(int idDocument) {

		Query query = (Query) session
				.createQuery("SELECT document FROM MotCle AS m where m.libelle="
						+ idDocument);
		List<Document> listDocument;
		listDocument = query.getResultList();
		return listDocument;
	}

	@Override
	public List<Document> findBOByDateMiseAjout(Date datemiseajour) {

		Query query = (Query) session
				.createQuery("SELECT  documents FROM HISTORY as H where h.HistoryDate=+"
						+ datemiseajour);
		@SuppressWarnings("unchecked")
		List<Document> listDocument = query.getResultList();

		return listDocument;
	}

}
