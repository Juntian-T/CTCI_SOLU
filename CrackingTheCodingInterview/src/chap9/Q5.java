package chap9;

import java.util.ArrayList;

public class Q5 {

	public ArrayList<String> allPerm(String s) {

		if (s.length() == 1) {
			ArrayList<String> result = new ArrayList<String>();
			result.add(s);
			return result;		
		} else {
			ArrayList<String> previous = allPerm(s.substring(0, s.length()-1));
			ArrayList<String> newResult = new ArrayList<String>();
			for (String old : previous) {
				for (int i = 0; i <= old.length(); i++) {
					String temp = insertChar(old, s.charAt(s.length()-1), i);
					newResult.add(temp);
				}
			}
			return newResult;
		}
	}

	public String insertChar(String s, char c, int i) {
		String before = s.substring(0, i);
		String after = s.substring(i, s.length());
		return before + c + after;
	}
	
	
	public static void main(String[] args) {
		Q5 q = new Q5();
		ArrayList<String> result = q.allPerm("abc");
		for (String i : result) {
			System.out.println(i);
		}
	}
}
