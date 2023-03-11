package test15;

import java.util.Scanner;

public class cake {

	static class array {
		int x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			array[] a = new array[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = new array();
				a[i].x = sc.nextInt();
			}
			int count = 0;
			b[0] = 1;
			for (int i = 1; i < n; i++) {
				int max = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (a[i].x < a[j].x && b[j] > max) {
						max = b[j];
					}
				}
				b[i] = max + 1;
				if (count < b[i]) {
					count = b[i];
				}
			}
			System.out.println(count);

		}
	}
}
