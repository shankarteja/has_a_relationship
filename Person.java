package has_a_relationship;

public class Person{
	String name;
	int age;
	int id;
	Address add;
	public Person(String name, int age, int id, Address add) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.add = add;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public Address getAdd() {
		return add;
	}


}

