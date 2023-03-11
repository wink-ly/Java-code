package test7;

import java.util.Scanner;

public class yu7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = 0;
			for (int i = 1; i <= n; i++) {
				if (i % 7 != 0 && no7(i))
					s += i * i;
			}
			System.out.println(s);
		}
	}

	static boolean no7(int num) {
		String s = String.valueOf(num);
		if(s.contains("7")) 
			return false;
		else
			return true;
	}
}
