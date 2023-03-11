package test13;

import java.util.Arrays;
import java.util.Scanner;

public class load {

	static int[] z = new int[105];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int[] x = new int[n];
			int[] w = new int[n];
			int[] w1 = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				w[i] = sc.nextInt();
				w1[i] = w[i];
			}
			Arrays.sort(w);
			fun(c, x, w);
			int s = 0;
			for (int i = 0; i < n; i++) {
				if (z[i] == 1)
					s++;
			}
			int[] m = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (w[i] == w1[j])
						m[i] = j + 1;
				}
			}
			int[] l = new int[s];
			for (int i = 0; i < s; i++)
				l[i] = m[i];
			Arrays.sort(l);
			System.out.println(s);
			for (int i = 0; i < s; i++) {
				System.out.printf("%d ", l[i]);
			}
		}
	}

	private static int[] fun(int c, int[] x, int[] w) {
		// TODO Auto-generated method stub
		z[0] = 1;
		c -= w[0];
		for (int i = 1; i < w.length; i++) {
			if (c - w[i] >= 0) {
				c -= w[i];
				z[i] = 1;
			}
		}
		return z;
	}

}
