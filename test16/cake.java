package test16;

import java.util.Scanner;

public class cake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(fun(n));
		}
	}

	private static int fun(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else
			return (fun(n-1)+1)*3/2;
	}

}
