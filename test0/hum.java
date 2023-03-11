package test0;

import java.util.Scanner;

public class hum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st1 = "";
		String st2 = "";
		String st3 = "";
		for(int i=1;i<=n-1;i++) {
			st1+="1";
		}
		for(int i=1;i<=n-1;i++) {
			st2+="0";
		}
		for(int i=1;i<=n-2;i++) {
			st3+="0";
		}
		System.out.print("1"+st1+"  ");
		System.out.println(st1+"1");
		
		System.out.print("1"+st2+"  ");
		System.out.println("1"+st3+"1");
		
		System.out.print("1"+st1+"  ");
		System.out.println("1"+st3+"1");
		
		System.out.print("1"+st3+"1"+"  ");
		System.out.println("1"+st3+"1");
		
		System.out.print("1"+st1+"  ");
		System.out.println(st1+"1");
	}
}
