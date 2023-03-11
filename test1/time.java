package test1;

import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h, m, s;
		if (n < 3600) {
			h = 0;
			m = n / 60;
			s = n % 60;
			System.out.println(h + ":" + m + ":" + s);
		} else {
			int a, b;
			a = n / 60;
			h = a / 60;
			m = a % 60;
			s = n % 60;
			System.out.println(h + ":" + m + ":" + s);
		}

	}

}
