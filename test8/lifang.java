package test8;

import java.util.Scanner;

public class lifang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = 0;
		for (int i = 1; i <= b; i++) {
			if (i * i * i < a)
				continue;
			if (i * i * i > b)
				break;
			int x = i, n = 1;
			while(x>0) {
				x = x / 10;
				n = n * 10;
			}
			if (i * i * i % n == i)
				s++;
		}
		System.out.println(s);
	}
}
