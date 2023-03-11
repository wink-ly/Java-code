package test15;

import java.util.Scanner;

public class nikechesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = n * n;
			int h = n / 2;
			int k = m-(2*h-1);
			int x = m-(2*h);
			for (int i = 1; i <= n; i++) {
				if (n % 2 == 0) {
					if(i!=n) {
						System.out.print(k);
						System.out.print("+");
						k=k+2;
					}else
						System.out.println(k);
				}else {
					if(i!=n) {
						System.out.print(x);
						System.out.print("+");
						x=x+2;
					}else
						System.out.println(x);
				}
			}
		}
	}

}
