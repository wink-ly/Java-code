package test8;

import java.util.Scanner;

public class ball {

	static int[][] num = new int[200][200];
	static int[][] s = new int[200][200];
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= 2 * i - 1; j++) {
					s[i][j] = sc.nextInt();
				}
			}
			for (int i = 1; i <= 2 * n - 1; i++)
				num[n][i] = s[n][i];
			for (int i = n - 1; i >= 1; i--) {
				for (int j = 1; j <= 2 * i - 1; j++) {
					num[i][j] = s[i][j] + max(num[i + 1][j], num[i + 1][j + 1], num[i + 1][j + 2]);
				}
			}
			System.out.println(num[1][1]);
		}
	}

	static int max(int a, int b, int c) {
		int h = (a > b) ? a : b;
		return (c > h) ? c : h;
	}

}
