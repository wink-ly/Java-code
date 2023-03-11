package test13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class benifit {

	static double benifit;
	static double[] x = new double[1000];
	static int m, n;
	static Element[] bag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			m = sc.nextInt();
			n = sc.nextInt();

			bag = new Element[n + 1];
			for (int i = 1; i <= n; i++) {
				bag[i] = new Element();
				bag[i].w = sc.nextDouble();
				bag[i].v = sc.nextDouble();
				bag[i].p = bag[i].v / bag[i].w;
			}
			Arrays.sort(bag, 1, n + 1, new cmp());
			knapsack();
		}
	}

	static void knapsack() {
		benifit = 0;
		double weight = m;
		int i = 1;
		while (i <= n && bag[i].w <= weight) {
			x[i] = 1;
			weight -= bag[i].w;
			benifit += bag[i].v;
			i++;
		}
		if (i <= n && weight > 0) {
			x[i] = (1.0) * weight / bag[i].w;
			benifit += x[i] * bag[i].v;
		}
		System.out.println(String.format("%.2f", benifit));
	}

}

class Element {
	double w;
	double v;
	double p;
}

class cmp implements Comparator<Element> {
	public int compare(Element a, Element b) {
		if (a.p < b.p)
			return 1;
		else
			return -1;
	}
}
