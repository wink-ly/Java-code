package test11;

import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			sc.nextLine();
			String st1 = sc.nextLine();
			String st2 = sc.nextLine();
			st1 = st1.replace(" ", "");
			st2 = st2.replace(" ", "");
			char[] ch1 = st1.toCharArray();
			char[] ch2 = st2.toCharArray();
			int[][] c = new int[n + 1][n + 1];
			if (fun(c, ch1, ch2, n) > 0.5)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}

	static double fun(int[][] c, char[] ch1, char[] ch2, int n) {
		for (int i = 0; i < ch1.length; i++)
			for (int j = 0; j < ch2.length; j++)
				c[i][j] = 0;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j])
					c[i + 1][j + 1] = c[i][j] + 1;
				else if (c[i + 1][j] >= c[i][j + 1])
					c[i + 1][j + 1] = c[i + 1][j];
				else
					c[i + 1][j + 1] = c[i][j + 1];
			}
		}
		double m = c[ch1.length][ch2.length];
		double x = m / n;
		return x;
	}

}
