package has_a_relationship;

public class ManagerTest {

	public static void main(String[] args) {
		Address a =new Address("andhra pradesh", "vizag", "steelplant", 530046);
		Person p =new Person("Rocky", 25, 321, a);
		System.out.println(p.getAge()+" "+p.getId()+" "+p.getName()+" "+p.getAdd().state+" "+p.getAdd().city+" "+p.getAdd().pincode);
		Address a1=new Address("india", "ap", "vizagd", 530047);
		Address a2=new Address("kuramnnapalem", "steelplant", "duvvada", 530048);
		Employee e =new Employee("teja", 123, 321, a1, a2);
		System.out.println(e.getAge()+" "+e.getId()+" "+e.getName()+" ");
		System.out.println("adress 1: "+e.getPresent().city+" "+p.getAdd().state +" "+p.getAdd().country+" "+p.getAdd().pincode);
		System.out.println("adress 2: "+e.getOffice().city+" "+e.getOffice().state +" "+e.getOffice().country+" "+e.getOffice().pincode);

	}

}
