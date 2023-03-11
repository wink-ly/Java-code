package test12;

import java.util.Scanner;

public class XPsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int flag = 0;
		for (int i = m; i <= n - 2; i++) {
			boolean a = fun(i);
			boolean b = fun(i + 2);
			if (a && b)
				flag++;
		}
		System.out.println(flag);
	}

	private static boolean fun(int n) {
		// TODO Auto-generated method stub
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
			continue;
		}
		return true;
	}

}
