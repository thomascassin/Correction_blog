package blog.sildy.test;

import java.util.List;

public class User {
	private int id;
	private String email;
	private String nom;
	private String pass;
	private String prenom;
	private List<User> users;

	public User() {
		
	}
	public User(String email, String motPasse) {
		this.setEmail(email);
		this.setPass(motPasse);
		
	}

	public User(int id, String email, String pass, String nom, String prenom) {
		this.setEmail(email);
		this.setPass(pass);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setId(id);
	}


	public User( String email, String pass, String nom, String prenom) {
		this.setEmail(email);
		this.setPass(pass);
		this.setNom(nom);
		this.setPrenom(prenom);
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User login() {
		// TODO Auto-generated method stub
		User user = null;
		for(User u : this.users) {
			System.out.println(u.getEmail());
			
			if(u.getPass().equals(this.getPass()) && u.getEmail().equals(this.getEmail())) {
				user = u;
				System.out.println(user.email);
			}
		}
		return user;

	}

	public User CreerUser(User newUser) {
		id = this.users.get(this.users.size()-1).getId()+1;
		newUser.setId(id);
		users.add(newUser);
		return newUser;
	}
	
	public String getNomComplet() {
		
		return this.prenom + ' '+this.nom;
	}

}
