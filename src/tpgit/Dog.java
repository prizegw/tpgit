package tpgit;

public class Dog extends Animal {
	private String name;
	public Dog(String couleur, Boolean carni, String name) {
		super(couleur, carni);
		this.name=name;
	}
	
}
