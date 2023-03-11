package test10;

import java.util.Scanner;

public class apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			System.out.println(fun(M, N));
		}
	}

	static int fun(int m, int n) {
		if (m == 0 || n == 1)
			return 1;
		if (m < n)
			return fun(m, m);
		else
			return fun(m, n - 1) + fun(m - n, n);
	}
}
