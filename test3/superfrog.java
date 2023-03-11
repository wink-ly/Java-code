package test3;

import java.util.Scanner;

public class superfrog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n>0) {
				System.out.println(fun(n));
			}
		}
	}

	static int fun(int n) {
		if (n <= 1)
			return n;
		else
			return 2*fun(n-1);
	}
}
