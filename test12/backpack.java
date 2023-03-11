package test12;

import java.util.Scanner;

public class backpack {

	static int[][] m = new int[105][105];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int[] v = new int[n];
			int[] w = new int[n];
			int[] x = new int[n];
			for (int i = 0; i < n; i++)
				v[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				w[i] = sc.nextInt();
			fun(w, v, c, n - 1, m);
			traceback(m, w, c, n - 1, x);
			System.out.println(m[0][c]);
			for (int i = 0; i < n; i++)
				System.out.print(x[i]);
		}
	}

	private static void traceback(int[][] m, int[] w, int c, int n, int[] x) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (m[i][c] == m[i + 1][c])
				x[i] = 0;
			else {
				x[i] = 1;
				c = c - w[i];
			}
		}
		x[n] = m[n][c] > 0 ? 1 : 0;
	}

	private static void fun(int[] w, int[] v, int c, int n, int[][] m) {
		// TODO Auto-generated method stub
		int jMax = Math.min(w[n] - 1, c);
		for (int j = 0; j <= jMax; j++)
			m[n][j] = 0;
		for (int j = w[n]; j <= c; j++)
			m[n][j] = v[n];
		for (int i = n; i >= 0; i--) {
			int jMax1 = Math.min(w[i] - 1, c);
			for (int j = 0; j <= jMax1; j++)
				m[i][j] = m[i + 1][j];
			for (int j = w[i]; j <= c; j++)
				m[i][j] = Math.max(m[i + 1][j], m[i + 1][j - w[i]] + v[i]);
		}
	}

}
