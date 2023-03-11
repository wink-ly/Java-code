package test12;

import java.util.Scanner;

public class lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int c = sc.nextInt();
			int n = sc.nextInt();
			int[] v = new int[n];
			int[] w = new int[n];
			for (int i = 0; i < n; i++) {
				v[i] = sc.nextInt();
				w[i] = sc.nextInt();
			}
			int[][] m = new int[n][c + 1];
			fun(v, w, c, m);
			System.out.println(m[0][c]);
		}
	}

	private static void fun(int[] w, int[] v, int c, int[][] m) {
		// TODO Auto-generated method stub
		int n = v.length - 1;
		int jMax = Math.min(w[n] - 1, c);
		for (int j = 0; j <= jMax; j++)
			m[n][j] = 0;
		for (int j = w[n]; j <= c; j++)
			m[n][j] = v[n];
		for (int i = n - 1; i >= 0; i--) {
			jMax = Math.min(w[i] - 1, c);
			for (int j = 0; j <= jMax; j++)
				m[i][j] = m[i + 1][j];
			for (int j = w[i]; j <= c; j++)
				m[i][j] = Math.max(m[i + 1][j], m[i + 1][j - w[i]] + v[i]);
		}
	}

}
