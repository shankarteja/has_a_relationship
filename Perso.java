package has_a_relationship;

public class Perso {
	String name;
	int id;
	int age;
	public Perso(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}
