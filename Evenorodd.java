package Inclass;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		int a;
		String res;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		a=s.nextInt();
		if(a%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
			/*res=(a%==0) ? "even no":"odd no";
			System.out.println(res);
			WHY IN COMMENTED SECTION GIVE ERROR?
			
			*/
			
		
		
		// TODO Auto-generated method stub

	}

}
