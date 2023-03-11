package test6;

import java.util.Scanner;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int m = sc.nextInt();
			int[] b = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = sc.nextInt();
			int sum = m + n;
			int[] s = new int[sum];
			for (int i = 0; i < n; i++)
				s[i] = a[i];
			for (int i = 0; i < m; i++)
				s[i + n] = b[i];
			mersot(s, 0, sum-1);
			for (int i = 0; i < sum; i++) {
				System.out.printf("%d ", s[i]);
			}
		}
	}

	static void mersot(int[] s, int left, int right) {
		int[] t = new int[right+1];
		if (left < right) {
			int h = (left + right) / 2;
			mersot(s, left, h);
			mersot(s, h + 1, right);
			merge(s, t, left, h, right);
			for (int i = left; i <= right; i++)
				s[i] = t[i];
		}
	}

	static void merge(int[] s, int[] t, int left, int h, int right) {
		int i = left, j = h + 1,k=left;
		while (i <= h && j <= right) {
			if (s[i] <= s[j])
				t[k++] = s[i++];
			else
				t[k++] = s[j++];
		}
		while (i <= h)
			t[k++] = s[i++];
		while (j <= right)
			t[k++] = s[j++];
	}
}
