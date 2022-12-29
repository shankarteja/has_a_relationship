package has_a_relationship;

public class Faculty {
	String name;
	String branch;
	int id;
	Addres personal;
	Addres office;
	Addres home;
	
	
	public Faculty(String name, String branch, int id, Addres personal, Addres office, Addres home) {
	
		this.name = name;
		this.branch = branch;
		this.id = id;
		this.personal = personal;
		this.office = office;
		this.home = home;
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

	public Addres getPersonal() {
		return personal;
	}

	public Addres getOffice() {
		return office;
	}

	public Addres getHome() {
		return home;
	}

	
	

	

}
