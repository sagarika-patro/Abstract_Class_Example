package test;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
         int a=s.nextInt();
         
         BClass ob=new BClass(a);
         
         ob.calculate();
         ob.getResult();
         
		
		s.close();
	}

}
