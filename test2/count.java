package test2;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n;
			String s = sc.nextLine();
			n = Integer.parseInt(s);
			fun(n);
			System.out.println(n);
		}
	}
	static void fun(int n) {
		char[] ch = new char[100];
		if(n>=0) {
			if(ch[n-1]>='A'&&ch[n-1]<='Z')
				n++;
		}
		fun(n-1);
	}
}
