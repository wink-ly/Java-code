package test4;

import java.util.Scanner;

public class huan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			long s = 0;
			long sum;
			for (int i = 3 * n; i >= 1; i--) 
				s += i;
			sum = s * m;
			System.out.println(sum);
		}
	}
}
