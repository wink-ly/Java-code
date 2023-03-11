package test4;

import java.util.Scanner;

public class digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double n = sc.nextInt();
			System.out.printf("%.2f\n",fun(n));
		}
	}
	static double fun(double n) {
		double s = 0;
		if(n==1)
			return 1;
		else if(n>1&&n<=100) 
			s=1/(n*n);
			return 1/(n*n)+fun(n-1);
	}
}
