package chap1;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * @author JT
 *
 */

public class Q1 {
	
	//O(n) time complexity
	public static boolean allUnique(String s) {
		if (s.length() > 128) {
			return false;
		}

		boolean[] char_set = new boolean[128];
		for (int i=0; i<s.length(); i++) {
			if (char_set[(int) s.charAt(i)]) {
				return false;
			}
			char_set[(int) s.charAt(i)] = true;
		}

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(allUnique("abcdf"));
		
	}
}
