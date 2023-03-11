package test3;

import java.util.Scanner;

public class kimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long s = 0;
			int[] fei = new int[80];
			fei[0] = 1;
			fei[1] = 1;
			for (int i = 2; i < 80; i++) {
				fei[i] = (fei[i - 1] + fei[i - 2]);
			}
			for (int i = a-1; i < b; i++) {
				s+=fei[i]; 
			}
			System.out.printf("%1d\n",s);
		}
	}
}
