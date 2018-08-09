package sravanthi;

public class SortingStringArray {

	public static void main(String[] args) {
		String[] s= {"ramu","hari","sri","mouni","bhargavi","jyo","cheeru"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					}
			}
			//System.out.println(s[i]+" ");
			System.out.print(s[i]+"  ");
		}System.out.println();
		for(int k=s.length-1;k>=0;k--) {
			//System.out.println(s[k]+" ");
			System.out.print(s[k]+"  ");
		}
	}

}
