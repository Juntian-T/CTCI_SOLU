package chap11;

/**
 * You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 * 
 */
public class Q1 {

	public static int[] merge(int[] a, int[] b) {
		int i = 0, j = 0;

		while(j != b.length) {
			if (a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				i++;
			} else if (a[i] != 0) {
				i++;
			} else {
				a[i] = b[j];
				j++;
			}
		}
		return a;	
	}
	
	public static int[] merge(int[] a, int[] b, int lastIndexA, int lastIndexB) {
		int lastA = lastIndexA - 1;
		int lastB = lastIndexB - 1;
		int lastMerged = lastIndexA + lastIndexB - 1;

		while (lastB >= 0) {
			if (lastA >= 0 && a[lastA] > b[lastB]) {
				a[lastMerged] = a[lastA];
				lastA--;
			} else {
				a[lastMerged] = b[lastB];
				lastB--;
			}
			lastMerged--;
		}
		return a;
	}


	public static void main(String[] args) {
		int[] a = {3, 4, 6, 0, 0, 0, 0};
		int[] b = {1, 2, 3};
		
		for (int x : merge(a, b, 3 ,3))
			System.out.println(x);
		
	}
}
