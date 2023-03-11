package test11;

import java.util.Scanner;

public class xuliebuild {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int a[] = new int[n + 1];
			for (int i = 1; i <= n; i++)
				a[i] = sc.nextInt();
			fun(a, n);
		}
	}
	static void fun(int[] a,int n){
		int max, sign;
		int b[] = new int[n + 1];
		int pre[] = new int[n + 1];
		int c[] = new int[n + 1];
		b[1] = 1;
		for (int i = 2; i <= n; i++) {
			int max1 = 0;
			for (int j = i - 1; j >= 1; j--) {
				if (a[j] < a[i] && b[j] > max1) {
					max1 = b[j];
					pre[i] = j;
				}
			}
			b[i] = max1 + 1;
		}
		max = b[1];
		sign = 1;
		for (int i = 2; i <= n; i++) {
			if (b[i] > max) {
				max = b[i];
				sign = i;
			}
		}
		int s = sign;
		int num = max;
		int j = max;
		while (num > 0) {
			c[j] = a[s];
			j--;
			s = pre[s];
			num--;
		}
		for (int i = 1; i <= max; i++) {
			if (i == max)
				System.out.print(c[i] + "\n");
			else
				System.out.print(c[i] + " ");
		}
	}
}
