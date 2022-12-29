package has_a_relationship;

import java.util.Scanner;

public class Testrbihdfc {

	public static void main(String[] args) {
		HDFC h =new HDFC();
		h.create();
		h.processloan();
		h.dmart();
		RBI r=new HDFC();
		r.processLoan();
		r.create();
	
		
//		ICICI i = new ICICI();
//		i.create();
//		i.processLoan();
		
		

	}

	}


