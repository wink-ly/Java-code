package test16;

import java.util.Scanner;

public class youtian {

	static int[][] move = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { 1, -1 }, { -1, 0 }, { -1, -1 }, { -1, 1 }, { 1, 1 } };
	static int[][] idx;
	static int n, m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			m = sc.nextInt();
			n = sc.nextInt();
			int count = 0;
			String[] str = new String[m];
			idx = new int[m][n];
			for (int i = 0; i < m; i++)
				str[i] = sc.next();
			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++) {
					if (str[i].charAt(j) == '@' && idx[i][j] == 0) {
						count++;
						idx[i][j] = 1;
						slove(i, j, str);
					}
				}
			System.out.println(count);
		}
	}

	private static void slove(int x, int y, String[] str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			int mx = x + move[i][0];
			int my = y + move[i][1];
			if (mx >= 0 && mx < m && my >= 0 && my < n && str[mx].charAt(my) == '@' && idx[mx][my] == 0) {
				idx[mx][my] = 1;
				slove(mx, my, str);
			}
		}
	}

}
