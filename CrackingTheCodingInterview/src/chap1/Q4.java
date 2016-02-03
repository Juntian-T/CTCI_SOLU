package chap1;


/**
 * Write a method to replace all spaces in a string with'%20'. 
 * You may assume that the string has sufficient space at the end of the string 
 * to hold the additional characters, and that you are given the "true" length of the string.
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
 * 
 * EXAMPLE
 * Input: "Mr John Smith  "
 * Output: "Mr%20Dohn%20Smith"
 * 
 * @author JT
 *
 */
public class Q4 {

	public char[] replace(char[] inputStr, int len) {
		int spaceCount = 0;

		for (int i = 0; i < len; i++) {
			if (inputStr[i] == ' ') {
				spaceCount++;
			}
		}
		
		int newLength = len + spaceCount*2;
		//inputStr[newLength] = '\0';
		
		int i = len - 1;
		int j = newLength - 1;
		
		while (i >= 0 && j >= 0) {
			if (inputStr[i] != ' ') {
				swap(inputStr, i, j);
				i--;
				j--;
			} else {
				inputStr[j] = '0';
				j--;
				inputStr[j] = '2';
				j--;
				inputStr[j] = '%';
				j--;
				i--;
			}
		}
		return inputStr;
	}

	public void swap(char[] input, int i, int j) {
		char temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public static void main(String[] args) {
		Q4 q = new Q4();
		System.out.println(q.replace("Mr John Smith       ".toCharArray(), 13));
	}
}
