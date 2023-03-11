package test13;

import java.util.Arrays;
import java.util.Scanner;

public class video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = sc.nextInt();
		Arrays.sort(v);
		int l = m;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (l >= v[i]) {
				l -= v[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
