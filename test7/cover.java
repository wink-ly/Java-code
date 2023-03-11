package test7;

import java.util.Scanner;

public class cover {

	static int flag=1;
	static int[][] a = new int[1000][1000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = 0, q = 0;
		while (sc.hasNext()) {
			int n = sc.nextInt();
			flag=1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
					if (a[i][j] == -1) {
						p = i;
						q = j;
					}
				}
			}
			chessboard(0, 0, p, q, n);
			for(int i = 0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.printf("%d ",a[i][j]);
				}
				System.out.println();
			}
		}
	}

	static void chessboard(int tr, int tc, int dr, int dc, int n) {
		if (n == 1)
			return;
		int t = flag++;
		int s = n / 2;

		if (dr < tr + s && dc < tc + s)
			chessboard(tr, tc, dr, dc, s);
		else {
			a[tr + s - 1][tc + s - 1] = t;
			chessboard(tr, tc, tr + s - 1, tc + s - 1, s);
		}

		
		if (dr >= tr + s && dc < tc + s)
			chessboard(tr + s, tc, dr, dc, s);
		else {
			a[tr + s][tc + s - 1] = t;
			chessboard(tr + s, tc, tr + s, tc + s - 1, s);
		}

		if (dr < tr + s && dc >= tc + s)
			chessboard(tr, tc + s, dr, dc, s);
		else {
			a[tr + s - 1][tc + s] = t;
			chessboard(tr, tc + s, tr + s - 1, tc + s, s);
		}
		
		if (dr >= tr + s && dc >= tc + s)
			chessboard(tr + s, tc + s, dr, dc, s);
		else {
			a[tr + s][tc + s] = t;
			chessboard(tr + s, tc + s, tr + s, tc + s, s);
		}
	}
}
