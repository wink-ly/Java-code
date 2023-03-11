package test15;

import java.util.Scanner;

public class dijkstra {
	
	static int p[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c[][] = new int[n][n];
			p = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = 1000000;
					c[i][i] = 0;
				}
			}

			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int l = sc.nextInt();
				c[x][y] = l;
			}
			dijkstra(n, c);
			for (int i = 0; i < n; i++) {
				System.out.print(p[i] + " ");
			}

		}
	}

	private static void dijkstra(int n, int[][] c) {
		// TODO Auto-generated method stub
		boolean used[] = new boolean[n];
		for (int i = 1; i < n; i++) {
			used[i] = false;
		}
		used[0] = true;
		p[0] = 0;
		int dis[] = new int[n];
		for (int i = 0; i < n; i++) {
			dis[i] = c[0][i];
		}
		for (int i = 0; i < n - 1; i++) {
			int k = 0;
			int temp = 1000000;
			for (int j = 0; j < n; j++) {
				if (!used[j] && dis[j] < temp) {
					temp = dis[j];
					k = j;
				}
			}

			used[k] = true;
			for (int j = 0; j < n; j++) {
				if (dis[k] + c[k][j] < dis[j]) {
					dis[j] = dis[k] + c[k][j];
				}
			}
			p[k] = dis[k];
		}

	}

}
