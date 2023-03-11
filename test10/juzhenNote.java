package test10;

import java.util.Scanner;

public class juzhenNote {

	static int[] a = new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(fun(1, n - 1));
		}
	}

	private static int fun(int i, int j) {
		// TODO Auto-generated method stub
		int[][] m = new int[100][100];
		if (i == j)
			return 0;
		if (m[i][j] > 0)
			return m[i][j];
		int h = fun(i + 1, j) + a[i - 1] * a[i] * a[j];
		for (int r = i + 1; r < j; r++) {
			int t = fun(i, r) + fun(r + 1, j) + a[i - 1] * a[r] * a[j];
			if (t < h)
				h = t;
		}
		m[i][j] = h;
		return h;

	}

}
