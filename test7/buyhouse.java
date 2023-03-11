package test7;

import java.util.Scanner;

public class buyhouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int K = sc.nextInt();
			int sum = n,x = 1;
			double price = 200;
			double k = (double)K/100;
			while(sum < price && x <=21) {
				sum+=n;
				price = price*(1+k);
				x++;
			}
			if(sum>=price)
				System.out.println(x);
			else 
				System.out.println("Impossible");
		}
	}
}
