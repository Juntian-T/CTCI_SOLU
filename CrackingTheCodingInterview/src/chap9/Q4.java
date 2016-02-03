package chap9;

import java.util.ArrayList;

public class Q4 {
	
	public ArrayList<ArrayList<Integer>> allSubset(int[] set) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		result.add(new ArrayList<Integer>());

		for (int i : set) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> cur : result) {
				ArrayList<Integer> previous = new ArrayList<Integer>();
				previous.addAll(cur);
				previous.add(i);
				temp.add(previous);
			}
			result.addAll(temp);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Q4 s = new Q4();
		int[] set = {1, 4, 2, 3};
		
		ArrayList<ArrayList<Integer>> test = s.allSubset(set); 

	}
}
