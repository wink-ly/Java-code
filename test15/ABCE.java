package test15;

public class ABCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		fun(a, 0, 8);
	}

	private static void fun(int[] a, int x, int y) {
		// TODO Auto-generated method stub
		if (x == y) {
			int x1 = a[0] * 100 + a[1] * 10 + a[2];
			int x2 = a[3] * 100 + a[4] * 10 + a[5];
			int x3 = a[6] * 100 + a[7] * 10 + a[8];
			if (x1 + x2 == x3)
				System.out.printf("%d+%d=%d\n", x1, x2, x3);
			return;
		}
		for (int i = x; i <= y; i++) {
			swap(a, x, y);
			fun(a, x + 1, y);
			swap(a, y, x);
		}
	}

	private static void swap(int[] a, int x, int y) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = x; i <= y; i++) {
			temp = a[x];
			a[x] = a[i];
			a[i] = (char) temp;
		}
	}

}
