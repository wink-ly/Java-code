package test11;

import java.util.Scanner;

public class stone {

	static int[][] s = new int[200][200];
	static int[][] m = new int[200][200];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n + 1];
			for (int i = 1; i <= n; i++)
				a[i] = sc.nextInt();
			for (int i = 1; i <= n; i++)
				s[i][i] = a[i];
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j <= n; j++)
					s[i][j] = s[i][j - 1] + a[j];
			}
			fun(a, n);
			System.out.println(m[1][n]);
		}
	}

	static void fun(int[] a, int n) {
		for (int i = 1; i <= n; i++)
			m[i][i] = 0;
		for (int r = 2; r <= n; r++) {
			for (int i = 1; i <= n - r + 1; i++) {
				int j = i + r - 1;
				m[i][j] = m[i + 1][j] + s[i][j];
				for (int h = i + 1; h < j; h++) {
					int t = m[i][h] + m[h + 1][j] + s[i][j];
					if (t < m[i][j])
						m[i][j] = t;
				}
			}
		}
	}

}
