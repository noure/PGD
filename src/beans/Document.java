package beans;

// Generated Apr 23, 2014 6:50:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Document generated by hbm2java
 */
@Entity
@Table(name = "Document", catalog = "GED_DB")
public class Document implements java.io.Serializable {

	private long idDocument;
	private History history;
	private Repertory repertory;
	private Groupe groupe;
	private String themeDoc;
	private String titre;
	private Date dateEdition;
	private Date dateMiseAjour;
	private Date dateIncertion;
	private Integer tailleDoc;
	private Set typeDocuments = new HashSet(0);
	private Set motCles = new HashSet(0);
	private Set writedBies = new HashSet(0);

	public Document() {
	}

	public Document(long idDocument, History history, Repertory repertory) {
		this.idDocument = idDocument;
		this.history = history;
		this.repertory = repertory;
	}

	public Document(long idDocument, History history, Repertory repertory,
			Groupe groupe, String themeDoc, String titre, Date dateEdition,
			Date dateMiseAjour, Date dateIncertion, Integer tailleDoc,
			Set typeDocuments, Set motCles, Set writedBies) {
		this.idDocument = idDocument;
		this.history = history;
		this.repertory = repertory;
		this.groupe = groupe;
		this.themeDoc = themeDoc;
		this.titre = titre;
		this.dateEdition = dateEdition;
		this.dateMiseAjour = dateMiseAjour;
		this.dateIncertion = dateIncertion;
		this.tailleDoc = tailleDoc;
		this.typeDocuments = typeDocuments;
		this.motCles = motCles;
		this.writedBies = writedBies;
	}

	@Id
	@Column(name = "idDocument", unique = true, nullable = false)
	public long getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(long idDocument) {
		this.idDocument = idDocument;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idHistory", nullable = false)
	public History getHistory() {
		return this.history;
	}

	public void setHistory(History history) {
		this.history = history;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRepertory", nullable = false)
	public Repertory getRepertory() {
		return this.repertory;
	}

	public void setRepertory(Repertory repertory) {
		this.repertory = repertory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGroupe")
	public Groupe getGroupe() {
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	@Column(name = "themeDoc", length = 65535)
	public String getThemeDoc() {
		return this.themeDoc;
	}

	public void setThemeDoc(String themeDoc) {
		this.themeDoc = themeDoc;
	}

	@Column(name = "titre", length = 254)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateEdition", length = 0)
	public Date getDateEdition() {
		return this.dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateMiseAjour", length = 0)
	public Date getDateMiseAjour() {
		return this.dateMiseAjour;
	}

	public void setDateMiseAjour(Date dateMiseAjour) {
		this.dateMiseAjour = dateMiseAjour;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateIncertion", length = 0)
	public Date getDateIncertion() {
		return this.dateIncertion;
	}

	public void setDateIncertion(Date dateIncertion) {
		this.dateIncertion = dateIncertion;
	}

	@Column(name = "tailleDoc")
	public Integer getTailleDoc() {
		return this.tailleDoc;
	}

	public void setTailleDoc(Integer tailleDoc) {
		this.tailleDoc = tailleDoc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
	public Set getTypeDocuments() {
		return this.typeDocuments;
	}

	public void setTypeDocuments(Set typeDocuments) {
		this.typeDocuments = typeDocuments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
	public Set getMotCles() {
		return this.motCles;
	}

	public void setMotCles(Set motCles) {
		this.motCles = motCles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
	public Set getWritedBies() {
		return this.writedBies;
	}

	public void setWritedBies(Set writedBies) {
		this.writedBies = writedBies;
	}

}