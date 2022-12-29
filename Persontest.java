package has_a_relationship;

public class Persontest {

	public static void main(String[] args) {
		Person p =new Person(null, 0, 0, null);
		p.id=1;
		p.age=25;
		p.name="teja";
		
		Employe e= new Employe("teja", 11234, 23, 23123213, 23123123);
		e.id=2;
		e.age=26;
		e.name="tejaa";
		e.pf=11111;
		e.pan=222222;
		

		
	}

}
