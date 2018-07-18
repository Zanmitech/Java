package Mownika_javaPgrms;

public class repeatedCharactersInString {
	public static void main(String[] args) {
	      String s1="selenium";
	      String s2="Automation";
	      System.out.println("s1-->"+s1+"\t s2-->"+s2);
	      s1=s1.concat(s2);
	    
	      int b=s1.indexOf(s2);
	      
	      s2=  s1.substring(0,b);
	      s1=s1.substring(b);
	  
	   

	   System.out.println("s1-->"+s1+"\t s2-->"+s2);
			
		}

}
