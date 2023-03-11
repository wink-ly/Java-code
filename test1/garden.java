package test1;

import java.util.Scanner;

public class garden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				int z=sc.nextInt();
				int s,a,b,c;
				s=(x+y)/3;
				a=x-s;
				b=y-s;
				c=z*a/(a+b);
				System.out.println(c);
			}
		}
	}
}
