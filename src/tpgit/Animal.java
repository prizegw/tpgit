package tpgit;

public class Animal {
	
	private int[] couleur = new int[3];
	private Boolean carniv;
	
	public Animal(int[] couleur, Boolean carni) {
		
		this.couleur = couleur;
		this.carniv = carniv;
	}

	public int[] getCouleur() {
		return couleur;
	}

	public void setCouleur(int[] couleur) {
		this.couleur = couleur;
	}

	public Boolean getCarniv() {
		return carniv;
	}

	public void setCarniv(Boolean carniv) {
		this.carniv = carniv;
		//Bonjour
	}
	
  
}
