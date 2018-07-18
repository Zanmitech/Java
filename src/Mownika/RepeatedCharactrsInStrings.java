package Mownika;

public class RepeatedCharactrsInStrings {
	public static void main(String[] args) {
        String s="my mom is my mother";
        char Char;
        int count;
        s = s.toLowerCase();
        for (Char = 'a'; Char <= 'z'; Char++) {
            count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == Char) {
                    count++;
                }
            }
            if(count>1)
            System.out.println("Number of occurences of " + Char + " is " + count);
        }
        }
}
