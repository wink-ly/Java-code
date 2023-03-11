package test0;

import java.util.Scanner;

public class n235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n + 1];
		int flag = 1, i = 1;
		while (flag <= n) {
			i++;
			if (is235(i)) {
				num[flag] = i;
				flag++;
			}
		}
		System.out.println(num[n]);
	}

	public static boolean is235(int num) {
		String s = Integer.toString(num);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != '2' && ch != '3' && ch != '5')
				return false;
		}
		return true;
	}

}
