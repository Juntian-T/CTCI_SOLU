package chap11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 * @author JT
 *
 */
public class Q2 {

	public String[] sortAnagrams(String[] input) {

		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String str1, String str2) {
				char[] a = str1.toCharArray();
				char[] b = str2.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				return a.toString().compareTo(b.toString());
			}

		};

		Arrays.sort(input, comp);

		return input;
	}
	
	public static void main(String[] args) {
		String[] input = {"aba", "cd", "baa", "dc"};
		Q2 a = new Q2();
		a.sortAnagrams(input);
		for (String x : input) {
			System.out.println(x);
		}
		
	}
}
