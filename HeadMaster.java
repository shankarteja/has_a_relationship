package has_a_relationship;

public class HeadMaster {
	
	String name,fname,lname;
	int id,ph_no,pin;
	AddressToString present;
	public HeadMaster(int id, int ph_no, int pin, String name, String fname, String lname, AddressToString present,
			AddressToString office) {
		
	}
	@Override
	public String toString() {
		return "HeadMaster [name=" + name + ", fname=" + fname + ", lname=" + lname + ", id=" + id + ", ph_no=" + ph_no
				+ ", pin=" + pin + ", present=" + present + "]";
	}
	public HeadMaster(String name, String fname, String lname, int id, int ph_no, int pin, AddressToString present) {
		super();
		this.name = name;
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.ph_no = ph_no;
		this.pin = pin;
		this.present = present;
	}
	
}
