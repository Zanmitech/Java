package jyothi;

public class LargestNumber {

	public static void main(String[] args) {

		int[] a = { 34, 12, 22, 45, 18, 25 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("first largest number in given array " + a[a.length - 1]);
		System.out.println("second largest number in given array " + a[a.length - 2]);
	}

}
