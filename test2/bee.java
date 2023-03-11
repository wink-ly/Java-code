package test2;

import java.util.Scanner;

public class bee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n;
			int a = sc.nextInt();
			int b = sc.nextInt();
			n=b-a;
			System.out.println(fun(n));
		}
	}
	
	static int fun(int n) {
		if(n<4)
		  return n;
		else return fun(n-1)+fun(n-2);
	}
}
