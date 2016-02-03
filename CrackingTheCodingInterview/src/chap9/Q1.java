package chap9;

public class Q1 {

	public int possibleWays(int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		return possibleWays(n-1) + possibleWays(n-2) + possibleWays(n-3);  
	}
	
	public int possibleWaysDP(int n) {
		int[] DP = new int[n+1];
		
		DP[0] = 1;
		DP[1] = 1;
		DP[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			if (DP[i] == 0) {
				DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
			}
		}
		return DP[n];
	}
	
	
	public static void main(String[] args) {
		Q1 q = new Q1();
		System.out.println(q.possibleWays(20));
		
	}
}
