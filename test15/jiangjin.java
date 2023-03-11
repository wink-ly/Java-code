package test15;

import java.util.Arrays;
import java.util.Scanner;

public class jiangjin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int[] v = new int[m];
		for (int i = 0; i < m; i++)
			v[i] = sc.nextInt();
		Arrays.sort(v);
		if (n < m) {
			for (int i = m - 1; i >= m - n; i--)
				sum += v[i];
		} else {
			for (int i = 0; i < m; i++)
				sum += v[i];
		}
		System.out.println(sum);
	}

}
