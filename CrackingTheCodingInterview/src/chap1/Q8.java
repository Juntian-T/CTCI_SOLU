package chap1;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s i and s2, write code to check if s2 is a rotation of s1 
 * using only one call to isSubstring (e.g.,"waterbottle"is a rotation of "erbottlewat").
 * @author JT
 *
 */
public class Q8 {

	public boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) return false;

		int i = s2.length() - 1;
		int subStrLen = 0;
		char split = s2.charAt(i);

		while (true) {
			while (i >= 0 && s1.charAt(i) != split) {
				i--;
				subStrLen++;
			}
			if (i < 0) {
				return false;
			} else if (s1.substring(0, i+1).equals(s2.substring(subStrLen, s2.length()))) {
				return isSubstring(s2.substring(0, subStrLen), s1);
			} else {
				i--;
				subStrLen++;
				continue;
			}
		}
	}

	public boolean isRotation2(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		return (isSubstring(s1,s2+s2));
	}
	
	public boolean isSubstring(String s1, String s2) {
		return s2.contains(s1);
	}


	public static void main(String[] args) {
		Q8 q = new Q8();
		System.out.println(q.isRotation2("waterbottle", "ewaterbottl"));

	}

}
