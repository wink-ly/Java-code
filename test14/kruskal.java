package test14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class kruskal {

	static int[] parents = new int[1005];
	static int[] ran = new int[1005];
	static long count = 0;
	static Element[] node;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int flag = 0;
			for (int i = 0; i < n; i++)
				init(i);
			node = new Element[m];
			for (int i = 0; i < m; i++) {
				node[i] = new Element();
				node[i].x = sc.nextInt();
				node[i].y = sc.nextInt();
				node[i].v = sc.nextDouble();
			}
			Arrays.sort(node, 0, m, new cmp());
			for (int i = 0; i < m; i++) {
				if (merg(node[i].x, node[i].y) == 1) {
					count += node[i].v;
					flag++;
				}
			}
			if (flag != n - 1)
				System.out.println("No solution.");
			else
				System.out.println(count);
		}
	}

	private static int merg(int x, int y) {
		// TODO Auto-generated method stub
		x = findparent(x);
		y = findparent(y);
		if (x == y)
			return 0;
		if (ran[x] < ran[y]) {
			parents[x] = y;
		} else {
			parents[y] = x;
			if (ran[x] == ran[y])
				ran[x]++;
		}
		return 1;
	}

	private static int findparent(int x) {
		// TODO Auto-generated method stub
		if (parents[x] != x)
			parents[x] = findparent(parents[x]);
		return parents[x];
	}

	private static void init(int i) {
		// TODO Auto-generated method stub
		parents[i] = i;
		ran[i] = 0;
	}
}

class Element {
	int x, y;
	double v;
}

class cmp implements Comparator<Element> {
	public int compare(Element x, Element y) {
		if (x.v < y.v)
			return 1;
		else
			return -1;
	}
}
