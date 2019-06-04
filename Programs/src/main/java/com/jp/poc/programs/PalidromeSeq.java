package com.jp.poc.programs;

public class PalidromeSeq {

	public static void main(String[] args) {
//		for (int i = 0; i < 1000; i++)
//			for (int j = 0; j < 1000; j++)
//				dp[i][j] = -1;
//
//		int n = str.length();
		System.out.println("Total palindromic subsequence" + "are : " + countPS("abccba"));
	}

	static int countPS(String str) {
		int N = str.length();

		int[][] cps = new int[N + 1][N + 1];

		for (int i = 0; i < N; i++)
			cps[i][i] = 1;

		for (int L = 2; L <= N; L++) {
			for (int i = 0; i < N; i++) {
				int k = L + i - 1;
				if (k < N) {
					if (str.charAt(i) == str.charAt(k))
						cps[i][k] = cps[i][k - 1] + cps[i + 1][k] + 1;
					else
						cps[i][k] = cps[i][k - 1] + cps[i + 1][k] - cps[i + 1][k - 1];
				}
			}
		}

		return cps[0][N - 1];
	}
}
