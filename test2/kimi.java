package test2;

import java.util.Scanner;

public class kimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			s=fun(n);
			if(s%3==0)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
		}
	}
		
	static int fun(int n) {
		if(n==0)
			return 7;
		else if(n<2)
			return 11;
		else return fun(n-1)+fun(n-2);
	}
}
