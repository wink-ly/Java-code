package test16;

import java.util.Scanner;

public class digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fun(n));
	}

	private static int fun(int n) {
		// TODO Auto-generated method stub
		if (n <= 2)
			return 4;
		else
			return fun(n - 1) + (n - 1) * (n - 1) * n * n;
	}

}
