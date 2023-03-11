package test6;

import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		qsort(a, 0, n-1);
		for (int i = 0; i < n; i++)
			System.out.printf("%d ", a[i]);
		}
	}

	static void qsort(int[] a, int p, int r) {
		if (p < r) {
			int i = p, j = r;
			int temp = a[p];
			while (i < j) {
				while (a[j] >= temp && i < j)
					j--;
				a[i] = a[j];
				while (a[i] <= temp && i < j)
					i++;
				a[j] = a[i];
			}
			a[i] = temp;
			qsort(a, p, i - 1);
			qsort(a, i + 1, r);
		} else
			return;
	}
}