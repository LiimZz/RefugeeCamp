package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PartnerDocs database table.
 * 
 */
@Entity
@Table(name="PartnerDocs")
public class PartnerDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DocumentID")
	private int documentID;

	@Column(name="DocumentPath")
	private String documentPath;

	//bi-directional many-to-one association to Partner
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PartnerID")
	private Partner partner;

	public PartnerDoc() {
	}

	public int getDocumentID() {
		return this.documentID;
	}

	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}

	public String getDocumentPath() {
		return this.documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}