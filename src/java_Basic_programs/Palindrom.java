package java_Basic_programs;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int n,rem,temp,sum=0,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		n= sc.nextInt();
		temp=n;
		while(n>0){
			rem=n%10;
		sum=(sum*10)+rem;
			n=n/10;
			}
		if (temp==sum)
			System.out.println("it's a pal");
		 else 
		
			System.out.println("it's not a pal");	
	}

}


