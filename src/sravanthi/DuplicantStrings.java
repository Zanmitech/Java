package sravanthi;

public class DuplicantStrings {

	public static void main(String[] args) {
		String arr[]= {"java","html","sql","java","sql","selenium","manual"};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])&&(i!=j)) {
					System.out.println("duplicant element is : "+arr[j]);
				}
			}
		}
	}

}
