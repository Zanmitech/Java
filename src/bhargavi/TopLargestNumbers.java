package bhargavi;

public class TopLargestNumbers {

	public static void main(String[] args) 
	{
		int a[] = {2,45,10,61,89,100};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}				
			}
			System.out.println("" +a[i]);
			
		}
		System.out.println("First Largest Number in Array is-->" +a[a.length-1]);
		System.out.println("Second Largest Number in array is-->" +a[a.length-2]);

	}

}
