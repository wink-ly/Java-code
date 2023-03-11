package test13;

import java.util.Scanner;

public class addoil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] p = new int[k + 1];
			for (int i = 0; i < k + 1; i++) {
				p[i] = sc.nextInt();
			}
			int s = fun(n, k, p);
			if (s > 0)
				System.out.println(fun(n, k, p));
			else
				System.out.println("No Solution");
		}
	}

	private static int fun(int n, int k, int[] p) {
		// TODO Auto-generated method stub
		int l = n;
		int c = 0;
		for (int i = 0; i < k + 1; i++) {
			if (p[i] > n) {
				return 0;
			}
			if (l >= p[i])
				l -= p[i];
			else {
				l = n - p[i];
				c++;
			}
		}
		return c;
	}

}
