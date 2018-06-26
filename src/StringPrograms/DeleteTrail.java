package StringPrograms;

import java.util.Scanner;

public class DeleteTrail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_ofMembers=6;
		String names[]=new String[no_ofMembers];
		
		System.out.println("enter names for members of git");
		for(int i=0;i<no_ofMembers;i++) {
			 names[i]=sc.nextLine();	
		}
		System.out.println("Before sorting");
		for(int i=0;i<no_ofMembers;i++) {
			System.out.print(names[i]+"\t"); 
		}
		for(int i=0;i<no_ofMembers;i++) {
			for(int j=i+1;j<no_ofMembers;i++) {
				
				if(names[i].compareTo(names[j])>0) {
					
					String temp_var=names[i];
					names[i]=names[j];
					names[j]=temp_var;
					
					
				}
			}
		}
	
		System.out.print("Names in Sorted Order:");
        for (int i = 0; i < no_ofMembers; i++) 
        {
            System.out.print(names[i] + "\t");
        }
        
	}
 
	}


