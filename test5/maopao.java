package test5;

import java.util.Scanner;

public class maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++)
				if(a[i]>a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}
		for (int i = 0; i < 10; i++)
			System.out.printf("%d ", a[i]);
	}
}
