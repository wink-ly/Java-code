package test13;

import java.util.Scanner;

public class mooncake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			double a[] = new double[n];
			double b[] = new double[n];

			double w[] = new double[n];
			for (int i = 0; i < n; i++)
				w[i] = sc.nextDouble();

			double v[] = new double[n];
			for (int i = 0; i < n; i++)
				v[i] = sc.nextDouble();

			for (int i = 0; i < n; i++)
				a[i] = v[i] / w[i];
			fun(n,w,v,c,a,b);

		}

	}

	private static void fun(int n, double w[], double v[], double c, double[] a, double[] b) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					double temp = w[j];
					w[j] = w[j + 1];
					w[j + 1] = temp;
					double temp1 = v[j];
					v[j] = v[j + 1];
					v[j + 1] = temp1;
					double temp2 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp2;
				}
			}
		}
		int k;
		double max = 0;
		for (k = 0; k < n; k++) {
			if (w[k] <= c) {
				b[k] = 1;
				c -= w[k];
			} else
				break;
		}
		if (k < n)
			b[k] = (c / w[k]);
		for (int i = 0; i < b.length; i++)
			max += b[i] * v[i];
		System.out.printf("%.2f\n", max);
	}
}
