package test2;

import java.util.Scanner;

public class baoshu {

	static int n,m,k;
	static int personnum,result,times;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();
			if (0 == n && 0 == m && 0 == k) {
				break;
			}
			fun();
			System.out.println(result);
		}
	}

	static void fun() {
		personnum = 0;
		result = 0;
		times = 0;
		int flag = 1;
		while (times < k) {
			if (personnum <= 1) {
				flag = 1;
			}
			if (personnum >= n) {
				flag = -1;
			}
			personnum += flag;
			result++;
			if (personnum == m) {
				if (result % 7 == 0 || String.valueOf(result).contains("7")) {
					times++;
				}
			}
		}
	}
}
