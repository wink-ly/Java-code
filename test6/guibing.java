package test6;

import java.util.Scanner;

public class guibing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			mersot(a, 0, n-1);
			for (int i = 0; i < n; i++) {
				System.out.printf("%d ", a[i]);
			}
			System.out.printf("\n");
		}
	}

	static void mersot(int[] a, int left, int right) {
		int[] t = new int[right+1];
		if (left < right) {
			int h = (left + right) / 2;
			mersot(a, left, h);
			mersot(a, h + 1, right);
			merge(a, t, left, h, right);
			for (int i = left; i <= right; i++)
				a[i] = t[i];
		}
	}

	static void merge(int[] a, int[] t, int left, int h, int right) {
		int i = left, j = h + 1,k=left;
		while (i <= h && j <= right) {
			if (a[i] <= a[j])
				t[k++] = a[i++];
			else
				t[k++] = a[j++];
		}
		while (i <= h)
			t[k++] = a[i++];
		while (j <= right)
			t[k++] = a[j++];
	}
}
