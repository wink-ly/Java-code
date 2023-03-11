package test10;

import java.util.Scanner;

public class xiexian {

	static int[][] a = new int[100][100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int max = 0, min = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				max = min = a[0][i - 1];
				for (int j = 1; j < n - i + 1; j++) {
					int h = j + i - 1;
					if (a[j][h] < min)
						min = a[j][h];
					if (a[j][h] > max)
						max = a[j][h];
				}
				System.out.printf("L%d=%d, S%d=%d\n", i, max, i, min);
			}
		}
	}

}
