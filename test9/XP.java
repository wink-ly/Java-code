package test9;

import java.util.Scanner;

public class XP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int t = sc.nextInt();
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] a = new int[m][n];
			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			int sum = fun(m, n, a);
			System.out.print(sum);
		}
	}

	static int fun(int m, int n, int[][] a) {
		int s = a[0][0];
		for (int i = 0; i < m - 1;)
			for (int j = 0; j < n - 1;) {
				if (a[i + 1][j] >= a[i][j + 1]) {
					s += a[i][j + 1];
					j = j + 1;
				} else {
					s += a[i + 1][j];
					i = i + 1;
				}
			}
		return s;
	}
}
