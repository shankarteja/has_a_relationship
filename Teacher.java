package has_a_relationship;

public class Teacher {

	String name,fname,lname;
	int id,ph_no,pin;
	AddressToString permenent;
	AddressToString present;
	AddressToString office ;
	public Teacher(String name, String fname, String lname, int id, int ph_no, int pin, AddressToString permenent,
			AddressToString present, AddressToString office) {
		super();
		this.name = name;
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.ph_no = ph_no;
		this.pin = pin;
		this.permenent = permenent;
		this.present = present;
		this.office = office;
	}
	
	public String toString() {
		return "Teacher [name=" + name + ", fname=" + fname + ", lname=" + lname + ", id=" + id + ", ph_no=" + ph_no
				+ ", pin=" + pin + ", permenent=" + permenent + ", present=" + present + ", office=" + office + "]";
	}

}








