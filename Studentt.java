package has_a_relationship;

public class Studentt {
	String name,fname,lname;
	int id,ph_no,pin;
	 AddressToString add;
	
	public Studentt(String name, String fname, String lname, int id, int ph_no, int pin, AddressToString add) {
		super();
		this.name = name;
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.ph_no = ph_no;
		this.pin = pin;
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", ph_no=" + ph_no + ", pin=" + pin + ", name=" + name + ", fname=" + fname
				+ ", lname=" + lname + ", add=" + add + "]";
	}
	
	}
	


