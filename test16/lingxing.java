package test16;

import java.util.Scanner;

public class lingxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j < n - i; j++) 
					System.out.printf(" ");
					for (int h = 0; h <= i; h++) {
						System.out.printf("* ");
					}
					System.out.println();
			}
			for (int i = 0; i <= n - 1; i++) {
				for (int j = 0; j <= i; j++) 
					System.out.printf(" ");
					for (int h = 0; h < n - i; h++) {
						System.out.printf("* ");
					}
					System.out.println();
			}
			System.out.println();
		}
	}

}
