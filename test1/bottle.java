package test1;

import java.util.Scanner;

public class bottle {
	static int num = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n!=0) {
				fun(n);
				System.out.println(num);
				num=0;
			}
			else 
				System.out.println();
		}
	}
	static void fun(int n) {
		if(n<2)
			return ;
		else 
			num++;
			fun(n-2);
	}
}
