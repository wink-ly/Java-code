package test4;

import java.util.Scanner;

public class silengzhui {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double n = sc.nextDouble();
			double h = n * n * n;
			double s = (2.0 / 3) * 1.236067977;
			System.out.printf("%.2f\n", s * h);
		}
	}
}
