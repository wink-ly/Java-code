package test4;

import java.util.Scanner;

public class shibie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = null,b=null;
		for(int i=0;i<=5;i++) {
			if(i==4)
				a=sc.nextLine();
			else 
				b=sc.nextLine();
		}
		for(int i=0;i<4*n;i++) {
			if(a.charAt(i)=='*') {
				if(i%4==1)
					System.out.print("1");
				else if(i%4==0)
					System.out.print("2");
				else if(i%4==2)
					System.out.print("3");
			}
		}
	}
}
