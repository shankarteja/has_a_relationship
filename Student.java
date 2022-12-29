package has_a_relationship;

public class Student {
	String name;
	String branch;
	int id;
	Addres add;
	public Student(String name, String branch, int id, AddressToString a) {
	
		this.name = name;
		this.branch = branch;
		this.id = id;
		this.add = add;
	}
	public String getName() {
		return name;
	}


	public String getBranch() {
		return branch;
	}

	public int getId() {
		return id;
	}

	public Addres getAdd() {
		return add;
	}



}
