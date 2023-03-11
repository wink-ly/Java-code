package test3;

import java.util.Scanner;

public class Han2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (sc.hasNext()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			long s = 0;
			for (int i = 1; i <= n; i++) {
				s = (long) Math.pow(2, a - b);
			}
			System.out.println(s);
		}
	}
}
