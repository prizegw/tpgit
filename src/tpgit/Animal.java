package tpgit;

public class Animal {
	
	private String couleur;
	private Boolean carniv;
	
	public Animal(String couleur, Boolean carni) {
		
		this.couleur = couleur;
		this.carniv = carniv;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Boolean getCarniv() {
		return carniv;
	}

	public void setCarniv(Boolean carniv) {
		this.carniv = carniv;
	}
	
  
}
