package test16;

import java.util.Scanner;

public class ma {

	static int map[][];
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			map = new int[10][10];
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int i = 1; i <= 5; i++)
				for (int j = 1; j <= 5; j++)
					map[i][j] = 0;
			count = 0;
			solve(x, y, 1);
			if (count == 0)
				System.out.println("No solution!");
			else
				System.out.println(count);
		}
	}

	static void solve(int x, int y, int step) {
		if (step == 20) {
			count++;
			return;
		}
		int fx[] = { 1, 2, 2, 1, -1, -2, -1, -2 };
		int fy[] = { 2, 1, -1, -2, -2, 1, 2, -1 };
		int mx, my;
		for (int i = 0; i <= 7; i++) {
			mx = x + fx[i];
			my = y + fy[i];
			if (mx >= 1 && mx <= 5 && my >= 1 && my <= 4 && map[mx][my] == 0) {
				map[x][y] = step;
				solve(mx, my, step + 1);
				map[x][y] = 0;
			}
		}
	}
}
