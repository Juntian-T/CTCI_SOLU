package chap1;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string.
 * 
 * @author JT
 *
 */
public class Q5 {

	//O(n^2)
	public String compress(String input) {
		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 0; i < input.length() - 1; i++) {
			char c = input.charAt(i);
			while ( i < input.length() - 1 && c == input.charAt(i+1)) {
				count++;
				i++;
			}
			result.append(c);
			result.append(count);
			count = 1;
		}

		return result.length() > input.length() ? input : result.toString();
	}

	//O(n)
	public String compress2(String input) {
		StringBuffer result = new StringBuffer();
		char c = input.charAt(0);
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
			} else {
				result.append(c);
				result.append(count);
				c = input.charAt(i);
				count = 1;
			}
		}

		result.append(c);
		result.append(count);

		return result.length() > input.length() ? input : result.toString();
	}


	public static void main(String[] args) {
		Q5 q = new Q5();
		System.out.println(q.compress2("aaaabbbbbccdd"));

	}

}
