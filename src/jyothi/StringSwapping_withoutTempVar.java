package jyothi;

public class StringSwapping_withoutTempVar {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "manual";
		System.out.println(" Before swapping string s1=" + s1 + " s2=" + s2);
		s1 = s1.concat(s2);
		
		int i = s1.indexOf(s1);
		int j = s1.indexOf(s2);
		
		System.out.println("After swapping value of s1 is " + s1.substring(j));
		System.out.println("After swapping value of s2 is " + s1.substring(i, j));

	}

}
