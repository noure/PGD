package dao;

// Generated Apr 22, 2014 10:12:53 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MotCle generated by hbm2java
 */
@Entity
@Table(name = "MotCle", catalog = "GED_DB")
public class MotCle implements java.io.Serializable {

	private int idMotCle;
	private Document document;
	private String libelle;

	public MotCle() {
	}

	public MotCle(int idMotCle, Document document) {
		this.idMotCle = idMotCle;
		this.document = document;
	}

	public MotCle(int idMotCle, Document document, String libelle) {
		this.idMotCle = idMotCle;
		this.document = document;
		this.libelle = libelle;
	}

	@Id
	@Column(name = "idMotCle", unique = true, nullable = false)
	public int getIdMotCle() {
		return this.idMotCle;
	}

	public void setIdMotCle(int idMotCle) {
		this.idMotCle = idMotCle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDocument", nullable = false)
	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Column(name = "libelle", length = 254)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}