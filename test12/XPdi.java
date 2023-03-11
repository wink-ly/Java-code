package test12;

import java.util.Scanner;

public class XPdi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int y = sc.nextInt();
			int s = 0;
			for (int i = 1; n>0; i++) {
				if((n-i*y)<=0) {
					while(n>0) {
						n-=y;
						s++;
					}
					break;
				}
				n-=i*y;
				s+=i;
				s++;
			}
			System.out.println(s);
		}
	}

}
