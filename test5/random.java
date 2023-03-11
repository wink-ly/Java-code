package test5;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			System.out.printf("%d %d\n",n-m,m);
		}
	}
}
