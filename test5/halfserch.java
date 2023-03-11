package test5;

import java.util.Scanner;

public class halfserch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int s = sc.nextInt();
			System.out.println(fun(a, s, 0, n));
		}
	}

	static int fun(int[] a, int s, int low, int high) {
		int mid = (low + high) / 2;
		if (low > high)
			return -1;
		if (a[mid] > s) {
			return fun(a, s, low, mid - 1);
		} else if (a[mid] < s) {
			return fun(a, s, mid + 1, high);
		} else
			return mid+1;
	}
}
