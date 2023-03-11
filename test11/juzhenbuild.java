package test11;

import java.util.Scanner;

public class juzhenbuild {

	static int[][] s = new int[100][100];
	static int[][] m = new int[100][100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			fun(a, n - 1);
			traceback(s, 1, n - 1);
		}
	}

	static void fun(int[] a, int n) {
		for (int i = 1; i <= n; i++)
			m[i][i] = 0;
		for (int r = 2; r <= n; r++) {
			for (int i = 1; i <= n - r + 1; i++) {
				int j = i + r - 1;
				m[i][j] = m[i + 1][j] + a[i - 1] * a[i] * a[j];
				s[i][j] = i;
				for (int k = i + 1; k < j; k++) {
					int t = m[i][k] + m[k + 1][j] + a[i - 1] * a[k] * a[j];
					if (t < m[i][j]) {
						m[i][j] = t;
						s[i][j] = k;
					}
				}
			}
		}
	}

	static void traceback(int[][] s2, int i, int j) {
		if (i == j)
			return;
		traceback(s, i, s[i][j]);
		traceback(s, s[i][j] + 1, j);
		System.out.printf("A[%d:%d] * A[%d:%d]\n", i, s[i][j], s[i][j] + 1, j);
	}

}
