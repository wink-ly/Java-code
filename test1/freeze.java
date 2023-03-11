package test1;

import java.util.Scanner;

public class freeze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0) {
				System.out.println();
			}else {
				System.out.println(n);
			}
		}
	}
}
