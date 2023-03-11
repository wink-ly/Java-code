package test10;

import java.util.Scanner;

public class sum {

	static int[] b = new int[105];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(fun(a, n));
		}
	}

	private static int fun(int[] a, int n) {
		b[0] = a[0];
		for (int i = 0; i < n - 1; i++) {
			b[i + 1] = Max(a[i + 1] + b[i], a[i + 1]);
		}
		return b[n - 1];
	}

	private static int Max(int a, int b) {
		return a > b ? a : b;
	}

}
