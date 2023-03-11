package test1;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = 0;
		while(sc.hasNext()) {
		int n = sc.nextInt();
			s=fun(n);
			System.out.println(s);
		}
	}
	
	private static int fun(int n){
		if(n<10) {
			return n;
		}
		return n%10+fun(n/10);
	}

}
