package test2;

import java.util.Scanner;

public class digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double n = sc.nextInt();
			String str = String.format("%.6f", fun(n));
			System.out.println(str);
		}
	}
	private static double fun(double n) {
		if(n==1)
			return 1;
		else if(n%2==0) 
			return fun(n-1)-1/n;
		else 
			return fun(n-1)+1/n;
	}
}
