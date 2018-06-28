package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumbers 
{
	public static void main(String[] args) 
	{
		
		int a[] = new int[] { 1,2,3,4,1,2,7,5 };
		   Set<Integer> set = new LinkedHashSet<Integer>();
		   for (int i = 0; i < a.length; i++)
		   {
		     set.add(a[i]);
		   }
		   System.out.println("Array after removing duplicates");
		   System.out.println(set);
		  }
}
