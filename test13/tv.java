package test13;

import java.util.Scanner;

public class tv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int s[] = new int[n + 1];
			int e[] = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				s[i] = sc.nextInt();
				e[i] = sc.nextInt();
			}
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					int temp = 0;
					if (e[i] > e[j]) {
						temp = e[i];
						e[i] = e[j];
						e[j] = temp;

						temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
			}
			boolean bool[] = new boolean[n + 1];
			bool[1] = true;
			for (int i = 2, j = 1; i <= n; i++) {
				if (s[i] >= e[j]) {
					bool[i] = true;
					j = i;
				}
			}
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (bool[i])
					count++;
			}
			System.out.println(count);
		}
	}

}
