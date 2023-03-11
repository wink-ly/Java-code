package test4;

import java.util.Scanner;

public class huafen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n,sum;
		    Scanner sc = new Scanner(System.in);
		    while (sc.hasNext()) {
		    	n=sc.nextInt();
		        sum=fun(n,n);
		        System.out.printf("%d\n",sum);
		    }
	}
	 static int fun(int n,int m){
	    if((n<1)||(m<1))
	        return 0;
	    if((n==1)||(m==1))
	        return 1;
	    if(n<m)
	        return fun(n,n);
	    if(n==m)
	        return 1+fun(n,n-1);
	    return fun(n,m-1)+fun(n-m,m);
	}
}
