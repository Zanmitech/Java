package bhargavi;

public class CommonElementsInArray {

	public static void main(String[] args) 
	{
		int a1[] = {2,5,4,1};
		int a2[] = {18,5,0,2,7,4};
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a2.length; j++) 
			{
				if(a1[i]==a2[j])
				{
					System.out.println("common numbers in array are "  +a1[i]);
				}
			}
		}

	}

}
