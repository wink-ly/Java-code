package test14;

import java.util.Scanner;

public class niu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String s = sc.next();
			char[] c = new char[n];
			c = s.toCharArray();
			int L = 0, R = 0;
			for (int i = 0; i < n; i++) {
				if (c[i] == 'L')
					L++;
				if (c[i] == 'R')
					R++;
			}
			R = R % 4;
			L = L % 4;
			int count = (R - L) >= 0 ? (R - L) : (R - L + 4);
			switch (count) {
			case 0:
				System.out.println("N");
				break;
			case 1:
				System.out.println("E");
				break;
			case 2:
				System.out.println("S");
				break;
			case 3:
				System.out.println("W");
				break;
			}
		}
	}

}
