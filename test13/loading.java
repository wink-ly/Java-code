package test13;

import java.util.Scanner;

public class loading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int[] x = new int[n];
			int[] w = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				w[i] = sc.nextInt();
			}
			int h = 0;
			while (h < n - 1) {
				for (int j = 0; j < n - 1; j++)
					change(j, w, x);
				h++;
			}
			load(x, w, c);
		}
	}

	private static void change(int j, int[] w, int[] x) {
		if (w[j] > w[j + 1]) {
			int flag = w[j];
			w[j] = w[j + 1];
			w[j + 1] = flag;
			int temp1 = x[j];
			x[j] = x[j + 1];
			x[j + 1] = temp1;
		}
	}

	private static void load(int[] d, int[] w, int c) {
		int[] a = new int[w.length];
		int count = 0;
		for (int i = 0; i < w.length; i++) {
			if (c - w[i] >= 0) {
				count++;
				c -= w[i];
				a[i] = d[i];
			}
		}
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
