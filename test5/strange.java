package test5;

import java.util.Scanner;

public class strange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		System.out.printf("%.4f", fun(x, y));
	}
	static double fun(int x,double y) {
		return 6*Math.pow(x,7)+8*Math.pow(x, 6)+7*Math.pow(x, 3)+5*Math.pow(x, 2)-y*x;
	}
}
