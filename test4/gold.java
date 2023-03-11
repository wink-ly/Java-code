package test4;

import java.util.Scanner;

public class gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(fun(n));
		}
	}
	static int fun(int n) {
		if(n==1)
			return 2;
		else return n*n+1+fun(n-1);
	}
}
