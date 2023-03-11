package test8;

import java.util.Scanner;

public class note {

	static int[][] num = new int[105][105];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = fun(a,a);
			System.out.println(b);
		}
	}

	private static int fun(int a, int b) {
		if((a<1)||(b<1))
	        return 0;
		if((a==1)||(b==1))
	        return 1;
		if(a<b)
	        return fun(a,a);
		if(a==b){
	        if(num[a-1][a-2]==0)
	            num[a-1][a-2]=fun(a,a-1);
	        return 1+num[a-1][a-2];
	    }
		else{
	        if(num[a-1][b-2]==0)
	            num[a-1][b-2]=fun(a,b-1);
	        if(num[a-b-1][b-1]==0)
	            num[a-b-1][b-1]=fun(a-b,b);
	        return num[a-1][b-2]+num[a-b-1][b-1];
	    }
	}

}
