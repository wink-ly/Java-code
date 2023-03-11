package test0;

import java.util.Scanner;

public class gold {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
		    fun(n);
			System.out.println(fun(n));
			}
		}
	static int fun(int n) {
		int s=0;
		for(int i=1;i<=n;i++)
			s+=i*(i+1);
			return s;
	}
} 

