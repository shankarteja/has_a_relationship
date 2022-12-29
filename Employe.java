package has_a_relationship;

public class Employe extends Perso {
	int pan;
	int pf;
	public Employe(String name, int id, int age, int pan, int pf) {
		super(name, id, age);
		this.pan = pan;
		this.pf = pf;
	}
	public void display() {
		System.out.println(pan);
		System.out.println(pf);
	}

}

