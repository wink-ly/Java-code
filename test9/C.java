package test9;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Double n = sc.nextDouble();
			Double m = (double) Math.round(n/2);
			String c = sc.next();
			String st1 = "";
			String st2 = "";
			for(int i=0;i<n;i++) {
				st1+=c;
			}
			for(int i=0;i<n-2;i++) {
				st2+=" ";
			}
			for(int i=1;i<=m;i++) {
				if(i==1||i==m)
					System.out.println(st1);
				else {
					System.out.println(c+st2+c);
				}
			}
			System.out.println();
		}
	}
}
