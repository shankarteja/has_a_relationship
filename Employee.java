package has_a_relationship;

public class Employee {
	String name;
	int age;
	int id;
	Address present;
	Address office;
	public Employee(String name, int age, int id, Address present, Address office) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.present = present;
		this.office = office;
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

	public Address getPresent() {
		return present;
	}

	public Address getOffice() {
		return office;
	}



}
