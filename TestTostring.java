package has_a_relationship;


public class TestTostring {

	public static void main(String[] args) {
//		
//		AddressToString a=new AddressToString("rajeevnagar", "gajuwaka", "andhrapradesh", "india");
//		Studentt s=new Studentt("Roy", "K apparao", "krishnaveni", 123, 90009, 530046, a);
//		System.out.println(s);
//		System.out.println("****************student data**********************");
//
//		AddressToString ad=new AddressToString("peddagantayada", "gajuwaka", "andhrapradesh", "india");
//		AddressToString ae=new AddressToString("chinnagatayda", "gajuwaka", "andhrapradesh", "india");
//		System.out.println(ad);
//		System.out.println("********************** teacher addres****************");

		AddressToString aef=new AddressToString("peddagantayada", "gajuwaka", "andhrapradesh", "india");
		AddressToString aefd=new AddressToString("chinnagatayda", "gajuwaka", "andhrapradesh", "india");
		HeadMaster h=new HeadMaster("sumathi", "hr","nagamni" , 321, 3214, 2145, aefd);
		System.out.println(h);
	}
}