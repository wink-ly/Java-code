package test8;

import java.util.Scanner;

public class tirangle {

	static int[][] num = new int[100][100];
	static int[][] s = new int[100][100];
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++)
					num[i][j] = -1;
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					s[i][j] = sc.nextInt();
				}
			}
			fun(1, 1);
			System.out.println(num[1][1]);
		}
	}

	static int fun(int i, int j) {
		if (num[i][j] >= 0)
			return num[i][j];
		if (i == n + 1)
			return 0;
		return num[i][j] = s[i][j] + max(fun(i + 1, j), fun(i + 1, j + 1));
	}

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

}
