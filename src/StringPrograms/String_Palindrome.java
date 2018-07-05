package StringPrograms;

import java.util.Scanner;

public class String_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		String s1 = sc.next();
		char[] ch = s1.toCharArray();
		String s2 = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			s2 = s2 + ch[i];
		}

		if (s2.equals(s1)) {
			System.out.println(" given string is palindrome");
		} else {
			System.out.println(" given string is not palindrome");
		}

	}

}
