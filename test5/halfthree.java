package test5;

import java.util.Scanner;

public class halfthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int[] t = new int[q];
			for (int i = 0; i < q; i++) {
				t[i] = sc.nextInt();
			}
			System.out.println(fun(s, t, n, q));
		}
	}

	static int fun(int[] s, int[] t, int n, int q) {
		int c = 0;
		for (int i = 0; i < q; i++) {
			int low = 0, high = n - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (s[mid] == t[i]) {
					c++;
					break;
				} else if (s[mid] < t[i]) {
					low = mid + 1;
				} else
					high = mid - 1;
			}
		}
		return c;
	}
}
