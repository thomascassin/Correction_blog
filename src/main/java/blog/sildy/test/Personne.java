package blog.sildy.test;

import java.sql.Date;

public class Personne {
	private String nom;
	private String prenom;
	private Date date_naiss;
	private Boolean isDelected = false;

	public void setNom(String nom) {
		this.nom = nom;
		
	}

	public String  getNom() {
		return this.nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getNomComplet() {
		// TODO Auto-generated method stub
		return prenom + " "+nom;
	}

	public void supprimer() {
		this.isDelected = true;
		
	}

	public boolean getIsDelected() {
		
		return this.isDelected;
	}

}
