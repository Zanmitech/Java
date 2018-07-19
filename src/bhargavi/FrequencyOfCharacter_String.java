package bhargavi;

public class FrequencyOfCharacter_String {

	public static void main(String[] args)
	{
		String s = "Welcome to the World";
		char ch = 'W';
		int frequency = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(ch==s.charAt(i))
			{
				++frequency;
			}
		}
		System.out.println("Frequency of"   +ch+  "="  +frequency);

	}

}
