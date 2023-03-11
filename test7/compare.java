package test7;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (sc.hasNext()) {
			i++;
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double s = a - b;
			System.out.printf("Case ");
			System.out.printf("%d: ",i);
			fun(s);
		}
	}

	static void fun(double s) {
		if (s > 0)
			System.out.println("Bigger");
		else if (s < 0)
			System.out.println("Smaller");
		else
			System.out.println("Same");
	}
}
