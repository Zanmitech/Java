package Mownika;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number until we want print fibonocci series");
          int num=sc.nextInt();
          int n1=0,n2=1;
          System.out.println("fibanocci series");
          System.out.print(n1+" "+n2+" ");
          int n3=n1+n2;
          System.out.print(n3);
          while(n3<num) {
        	 
        	  n1=n2;
        	  n2=n3;
        	  n3=n1+n2;
        	  System.out.print(" "+n3);
          }
	}

}
