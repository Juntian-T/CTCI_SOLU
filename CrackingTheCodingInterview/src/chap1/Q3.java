package chap1;

public class Q3 {

	
	//O(n)
	public static boolean isPerm(String s1, String s2) {
		if (s1.length() != s2.length()) 
			return false;

		int[] charNum1 = new int[128];
		int[] charNum2 = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			charNum1[(int) s1.charAt(i)]++;
			charNum2[(int) s2.charAt(i)]++;
		}

		for (int i = 0; i < 128; i++) {
			if (charNum1[i] != charNum2[i]) 
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPerm("abcdf", "abcfd"));
		
	}
}
