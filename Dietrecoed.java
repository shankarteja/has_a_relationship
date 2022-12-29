package has_a_relationship;

public class Dietrecoed {

	public static void main(String[] args) {
		Addres a =new Addres(" rajeevnagar", "saibabatemple", "gajuwaka", "visakhapatnam", "andhrapradesh", 530046);
//		Student s =new Student("Roy","cse", 520123, a);
//		System.out.println(s.getName()+", "+s.getBranch()+", "+s.getId()+s.getAdd().street+", "+s.getAdd().location+", "+s.getAdd().district+", "+s.getAdd().state+", "+s.getAdd().pincode);
		Addres a1=new Addres("Nehru Street", "near nehru park", "Srinagar", "visakhapatnam","andhrapradesh" , 530047);
		Addres a2=new Addres("highway mainroad", "beside NH-5", "anakapalli", "visakhapatnam","andhrapradesh" , 530048);
		Addres a3=new Addres("peddagantayada", "near mvr college", "gajuwaka", "vizag", "app", 530049);
		Faculty f =new Faculty("sindu madam", "CSE-department", 123500, a, a2, a3);
		System.out.println(f.getName()+", "+f.getBranch()+", "+f.getId());
		System.out.println("home Address : "+f.getHome().street +", "+ f.getHome().location+", "+f.getHome().district+", "+f.getHome().state+", "+f.getHome().pincode);
		System.out.println("office Address : "+f.getOffice().street +", "+ f.getOffice().location+", "+f.getOffice().district+", "+f.getOffice().state+", "+f.getOffice().pincode);
		System.out.println(" personal Address : "+f.getPersonal().street +", "+ f.getPersonal().location+", "+f.getPersonal().district+", "+f.getPersonal().state+", "+f.getPersonal().pincode);



	}
 
}
