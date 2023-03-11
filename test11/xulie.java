package test11;

import java.util.Scanner;

public class xulie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(fun(n, a));
		}
	}

	static int fun(int n, int[] a) {
		int[] b = new int[n];
		b[0] = 1;
		for (int i = 1; i < a.length; i++) {
			b[i] = 1;
			for (int j = 0; j < i; j++)
				if (a[i] > a[j])
					b[i] = Math.max(b[i], b[j] + 1);
		}
		int max = 0;
		for (int i = 0; i < n; i++)
			if (b[i] > max)
				max = b[i];
		return max;
	}
}
