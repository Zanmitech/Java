package Mownika;

public class SameValuesInTwoArrays {
	public static void main(String[] args) {
	      int a[]= {1,2,3,4,6,8};
	      int b[]= {3,6,8,10,9,4};
	      System.out.println("same values in both arrays");
	      for(int i=0;i<a.length;i++) {
	    	  for(int j=0;j<b.length;j++) {
	    		  if(a[i]==b[j])
	    			  System.out.print(a[i]+" ");
	    	  }
	      }
		}

}
