package Model;

public class Product {
	private String nom,id;
	private double prix;
	private int quantite;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Product(String nom, String id, double prix, int quantite) {
		super();
		this.nom = nom;
		this.id = id;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Product() {
		super();
	}
	

}
