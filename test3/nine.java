package test3;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		fun(a, 8, 0);
	}

	static void fun(int[] a, int b, int c) {
		if (b == c) {
			int x = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
			int y = a[4] * 10000 + a[5] * 1000 + a[6] * 100 + a[7] * 10 + a[8];
			if (3 * x == y)
				System.out.printf("%d/%d\n", x, y);
			return;
		}
		for (int i = b; i >= c; i--) {
			swap(a, b, c);
			fun(a, b - 1, c);
			swap(a, c, b);
		}
	}

	static void swap(int[] a, int b, int c) {
		int temp;
		for (int i = b; i <= c; i++) {
			temp = a[b];
			a[b] = a[i];
			a[i] = (char) temp;
		}
	}
}
