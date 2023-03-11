package test6;

import java.util.Scanner;

public class smallk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str1 = sc.nextLine();
			String arr[] = str1.split(" ");
			int[] a = new int[arr.length];
			for (int i = 0; i < a.length; i++)
				a[i] = Integer.parseInt(arr[i]);
			String str2 = sc.nextLine();
			int k = Integer.parseInt(str2);
			int result = serch(a, 0, a.length - 1, k-1);
			System.out.println(result);
		}
	}

	private static int serch(int[] a, int l, int r, int k) {
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
		if (i == k)
			return a[i];
		else if (i > k)
			return serch(a, l, i - 1, k);
		else
			return serch(a, i + 1, r, k);
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
