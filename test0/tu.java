package test0;

import java.util.Scanner;

public class tu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int h = n; h >= 1; h--) {
			for (int j = 1; j < h; j++) {
				System.out.print(" ");
			}
			for (int i = n; i < 2 * n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
