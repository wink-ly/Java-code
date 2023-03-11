package test4;

import java.util.Scanner;

public class serch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n, q;
		while (sc.hasNext()) {
			int sum = 0;
			n = sc.nextLong();
			long[] s = new long[10000];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextLong();
			}
			q = sc.nextLong();
			long[] t = new long[500];
			for (int i = 0; i < q; i++) {
				t[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < q; j++) {
					if (s[i] == t[j])
						sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
