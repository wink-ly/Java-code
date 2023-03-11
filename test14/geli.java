package test14;

import java.util.Scanner;

public class geli {

	static int[] parents = new int[1005];
	static int[] ran = new int[1005];
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x, y, temp;
			for (int i = 0; i <= n; i++)
				init(i);
			for (int i = 0; i < m; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				for (int j = 1; j < x; j++) {
					temp = sc.nextInt();
					merg(y, temp);
				}
			}
			for (int i = 0; i < n; i++) {
				if (findparent(i) == findparent(0))
					count++;
			}
			System.out.println(count);
		}
	}

	private static void merg(int x, int y) {
		// TODO Auto-generated method stub
		x = findparent(x);
		y = findparent(y);
		if (x == y)
			return;
		if (ran[x] > ran[y])
			parents[y] = x;
		else {
			parents[x] = y;
			if (ran[x] == ran[y])
				ran[y]++;
		}
	}

	private static void init(int i) {
		// TODO Auto-generated method stub
		parents[i] = i;
		ran[i] = 0;
	}

	private static int findparent(int x) {
		// TODO Auto-generated method stub
		if (parents[x] != x)
			parents[x] = findparent(parents[x]);
		return parents[x];
	}
}
