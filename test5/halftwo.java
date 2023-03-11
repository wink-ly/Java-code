package test5;

import java.util.Scanner;

public class halftwo {

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
			System.out.println(fun(a, s));
		}
	}

	static int fun(int[] a, int s) {
		int low = 0;
		int high = a.length - 1;
		if (low > high)
			return -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] > s) {
				high = mid - 1;
			} else if (a[mid] < s) {
				low = mid + 1;
			} else
				return mid + 1;
		}
		return -1;
	}
}
