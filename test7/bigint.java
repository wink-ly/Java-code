package test7;

import java.util.Scanner;

public class bigint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			int m = (int) a;
			int flag = 0;
			while (m != 0) {
				m = m / 10;
				flag++;
			}
			System.out.printf("%d\n",fun(a,b,flag));
		}
	}
	static long fun(long a,long b,int n) {
		int s=sign(a)*sign(b);
		a = Math.abs(a);
		b = Math.abs(b);
	    long result;
	    if(a==0||b==0)
	    	result=0;
	    else if(n==1)
	    	result=s*a*b;
	    else{
	        long A1=(long)(a/Math.pow(10,n/2));
	        long B1=(a%(long)Math.pow(10,n/2));
	        long A2=(long)(b/Math.pow(10,n/2));
	        long B2=(b%(long)Math.pow(10,n/2));
	 
	        long A=fun(A1,A2,n/2);
	        long B=fun(B1,B2,n/2);
	        long AB=fun((A1-B1),(B2-A2),n/2)+A+B;
	 
	        result=(long)(s*(A*Math.pow(10,n)+AB*Math.pow(10,n/2)+B));
	    }
	    return result;
	}
	static int sign(long l){
	    int a;
	    if(l>0)
	        a=1;
	    else
	        a=-1;
	    return a;
	}
}
