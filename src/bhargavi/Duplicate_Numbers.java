package bhargavi;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate_Numbers
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,2,5,4,2,4,3};
		System.out.println("Before removing duplicates length of array =  "  +a.length);
		Set<Integer> set =  new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		System.out.println("Array after removing Duplicates"  +set);
		System.out.println("After removing duplicates length of array =  "  +set.size());
	}

}
