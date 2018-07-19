package Mownika;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int n=sc.nextInt();
		String a = "";
		String b="";
		
		while(n>0) {
			int rem=n%2;
			n=n/2;
			 a=a+rem;
			 
		}
		 for(int i=a.length()-1;i>=0;i--)
			 b+=a.charAt(i);
		
		 System.out.println(b);
		 
			 
		 
	}

}
