package test7;

import java.util.Scanner;

public class countfoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max,min;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a%2==0)
				max=a/2;
			else
				max=0;
			if(a%4==0)
				min=a/4;
			else {
				if(a%4==2)
					min=a/4+1;
				else 
					min=0;
			}
			System.out.printf("%d %d\n", min,max);
		}
	}

}
