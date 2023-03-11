package test2;

import java.util.Scanner;

public class gupai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(fun(n));
		}
	}
	static int fun(int n) {
		if (n<4) 
			return n;
		else
			return fun(n-1)+fun(n-2);
	}

}
