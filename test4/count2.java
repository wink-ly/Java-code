 package test4;

import java.util.Scanner;

public class count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n>=0) {
				System.out.println(count2.cou(n));
			}
		}
	}

	private static int cou(int n) {
		int flag = 0;
		for (int i = 0; i <= n; i++) {
			String s = Integer.toString(i);
			for(char ch: s.toCharArray()) {
				if (ch == '2') {
					flag++;
				}
			}
		}
		return flag;
	}
}
