package test2;

import java.util.Scanner;

public class daoxu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)
				System.out.print(0);
			else{
				while(n%10==0)
					n=n/10;
			}
			StringBuffer sb = new StringBuffer();
			fun(n, sb);
			System.out.println(sb.toString());
		}
	}

	static void fun(int n, StringBuffer sb) {
		if (n > 0) {
			int s = n % 10;
			sb.append(s);
			fun(n / 10, sb);
		}
	}
}
