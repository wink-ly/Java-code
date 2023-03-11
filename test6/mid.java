package test6;

import java.util.Scanner;

public class mid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			if (n % 2 == 0) {
				int x = middle(a, 0, n - 1, n / 2 - 1);
				int y = middle(a, 0, n - 1, n / 2);
				double s2 = (x + y) / 2.0;
				System.out.printf("%.3f", s2);
			} else {
				int s1 = middle(a, 0, n - 1, n / 2);
				System.out.println(s1);
			}
		}
	}

	static int middle(int[] a, int l, int r, int m) {
		if (l == r)
			return a[l];
		int i = l, j = r, t = a[l];
		while (i < j) {
			while (i < j && a[j] >= t)
				j--;
			while (i < j && a[i] <= t)
				i++;
			if (i < j)
				swap(a, i, j);
		}
		swap(a, i, l);
		if (i == m)
			return a[i];
		else if (i > m)
			return middle(a, l, i - 1, m);
		else
			return middle(a, i + 1, r, m);
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
