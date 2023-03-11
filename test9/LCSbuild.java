package test9;

import java.util.Scanner;

public class LCSbuild {

	static int[][] b = new int[100][100];
	static int[][] c = new int[100][100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String st1 = sc.next();
			char[] ch1 = new char[100];
			for (int i = 0; i < st1.length(); i++)
				ch1[i] = st1.charAt(i);
			String st2 = sc.next();
			char[] ch2 = new char[100];
			for (int i = 0; i < st2.length(); i++)
				ch2[i] = st2.charAt(i);
			int x = st1.length();
			int y = st2.length();
			fun(ch1, ch2, x, y);
			LCS(x, y, ch1);
		}
	}

	static void LCS(int x, int y, char[] ch) {
		if (x == 0 || y == 0)
			return;
		if (b[x][y] == 1) {
			LCS(x - 1, y - 1, ch);
			System.out.print(ch[x - 1]);
		} else if (b[x][y] == 2) {
			LCS(x - 1, y, ch);
		} else
			LCS(x, y - 1, ch);
	}

	static void fun(char[] ch1, char[] ch2, int x, int y) {
		for (int i = 1; i < x + 1; i++) {
			for (int j = 1; j < y + 1; j++) {
				if (ch1[i - 1] == ch2[j - 1]) {
					c[i][j] = c[i - 1][j - 1] + 1;
					b[i][j] = 1;
				} else if (c[i - 1][j] >= c[i][j - 1]) {
					c[i][j] = c[i - 1][j];
					b[i][j] = 2;
				} else {
					c[i][j] = c[i][j - 1];
					b[i][j] = 3;
				}
			}
		}
	}
}
