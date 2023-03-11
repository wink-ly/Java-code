package test10;

import java.util.Scanner;

public class supsum {

	static int[] b = new int[105];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			fun(a, n);
			int max = b[0], end = 0;
			if (n > 1) {
				for (int i = 0; i < n; i++) {
					if (b[i] >= max) {
						max = b[i];
						end = i;
					}
				}
			} else {
				max = a[0];
				end = 0;
			}
			int min = max, sta = 0;
			for (int i = end; i >= 0; i--) {
				min = min - a[i];
				if (min == 0)
					sta = i;
			}

			System.out.printf("%d %d %d\n", max, sta + 1, end + 1);
		}
	}

	private static void fun(int[] a, int n) {
		b[0] = a[0];
		for (int i = 0; i < n - 1; i++) {
			b[i + 1] = Max(a[i + 1] + b[i], a[i + 1]);
		}
	}

	private static int Max(int a, int b) {
		return a > b ? a : b;
	}

}
