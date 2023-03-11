package test14;

import java.util.Scanner;

public class work {

	static int[] parents = new int[1005];
	static int[] ran = new int[1005];
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x, y;
			count = n;
			for (int i = 1; i <= n; i++)
				init(i);
			for (int i = 0; i < m; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				merg(x, y);
			}
			System.out.println(count);

		}
	}

	private static void init(int i) {//每个元素作为一个集合
		// TODO Auto-generated method stub
		parents[i] = i;
		ran[i] = 0;
	}

	private static void merg(int x, int y) {
		// TODO Auto-generated method stub
		x = findParent(x);
		y = findParent(y);
		if (x == y)
			return;
		count--;
		if (ran[x] < ran[y])
			parents[x] = y;
		else {
			parents[y] = x;
			if (ran[x] == ran[y])
				ran[x]++;
		}
	}

	private static int findParent(int x) {
		// TODO Auto-generated method stub
		if (parents[x] != x)
			parents[x] = findParent(parents[x]);
		return parents[x];
	}

}
