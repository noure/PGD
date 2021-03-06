package beans;

// Generated Apr 23, 2014 6:50:01 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SousRepertoryId generated by hbm2java
 */
@Embeddable
public class SousRepertoryId implements java.io.Serializable {

	private long idRepertory;
	private long idSousRepertory;

	public SousRepertoryId() {
	}

	public SousRepertoryId(long idRepertory, long idSousRepertory) {
		this.idRepertory = idRepertory;
		this.idSousRepertory = idSousRepertory;
	}

	@Column(name = "idRepertory", nullable = false)
	public long getIdRepertory() {
		return this.idRepertory;
	}

	public void setIdRepertory(long idRepertory) {
		this.idRepertory = idRepertory;
	}

	@Column(name = "idSousRepertory", nullable = false)
	public long getIdSousRepertory() {
		return this.idSousRepertory;
	}

	public void setIdSousRepertory(long idSousRepertory) {
		this.idSousRepertory = idSousRepertory;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SousRepertoryId))
			return false;
		SousRepertoryId castOther = (SousRepertoryId) other;

		return (this.getIdRepertory() == castOther.getIdRepertory())
				&& (this.getIdSousRepertory() == castOther.getIdSousRepertory());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdRepertory();
		result = 37 * result + (int) this.getIdSousRepertory();
		return result;
	}

}
