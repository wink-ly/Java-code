package test3;

import java.util.Scanner;

public class hannuota {

	static int s = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			fun(n,'A','B','C');
			System.out.println();
			s=0;
		}
	}

	static void fun(int n,char a,char b,char c){
		 if(n>0){
		        fun(n-1,a,c,b);
		        move(n,a,c);
		        fun(n-1,b,a,c);
		    }
	}
	
	static void move(int n,char a,char b) {
		System.out.printf("第%d步:%d号盘从%c柱移至%c柱\n",++s,n,a,b);
	}
}
