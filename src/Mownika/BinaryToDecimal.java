package Mownika;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
	       
		int binary=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary number ");
		int n=sc.nextInt();
		int count=0;

		while(n>0) {
		int rem=n%10;
		if(rem==0)
		 binary=binary+rem
		 ;
		if(rem==1) {
			binary=(int) (binary+rem*Math.pow(2, count));
		}
		count++;
		n=n/10;
		
		}
		System.out.println("decimal number is "+binary);
		
	}

}
