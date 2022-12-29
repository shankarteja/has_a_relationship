package has_a_relationship;

import java.util.Scanner;

import com.demo.fackbank.ICICI;

public class Testcanraandhra {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the bank name");
		String str=sc.next();
		if (str.equalsIgnoreCase("canara")) {
			CANARA c=new CANARA();
			c.createacc();
			c.debitcard();

		}
		else if (str.equalsIgnoreCase("andhra")) {
			Andhra a=new Andhra();
			executive(a);
			//			a.createacc();
						a.currentacc();
			//			a.debitcard();
		}
		else if (str.equalsIgnoreCase("axis")) {
			Axis x=new Axis ();
			//			x.createacc();
			//			x.debitcard();
						x.creditcard();
			executive(x);
		}
	}
	public static void executive(CANARA c) {
		c.createacc();
		c.debitcard();


	}

}



