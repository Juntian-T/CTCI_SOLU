package chap11;

import java.util.Arrays;

/**
 * Given a sorted array of n integers that has been rotated an unknown number of times, 
 * write code to find an element in the array. You may assume that the array was originally 
 * sorted in increasing order.
 * 
 * @author JT
 *
 */

public class Q3 {

	public int findIndex(int[] input, int target) {
		int firstEle = 0;
		while (firstEle+1 <= input.length - 1 && input[firstEle] <= input[firstEle+1]) {
			firstEle++;
		}
		firstEle++;
		if (firstEle == input.length) {
			firstEle = 0;
		}

		int indexA = Arrays.binarySearch(Arrays.copyOfRange(input, 0, firstEle), target);
		int indexB = Arrays.binarySearch(Arrays.copyOfRange(input, firstEle, input.length), target);

		return indexA == -1 ? indexB + firstEle : indexA;
	}


	public static void main(String[] args) {
		int[] input = {1, 3, 4, 5, 7, 10, 14};
		Q3 q = new Q3();
		System.out.println(q.findIndex(input, 14));
	}

}
