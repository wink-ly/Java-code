package test10;

import java.util.Scanner;

public class juzhen {

	static int[] a = new int[100];
	static int[][]m = new int[100][100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
	    while(sc.hasNext()) {
	    	int n = sc.nextInt();
	    	for(int i = 0;i<n;i++)
	    		a[i]=sc.nextInt();
	    	fun(a,n);
	    	System.out.println(m[1][n-1]);
	    }
	}
	private static void fun(int[] a,int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
			m[i][i]=0;
		for(int r=2;r<=n;r++) {
			for(int i=1;i<=n;i++) {
				int j=i+r-1;
				m[i][j]=m[i+1][j]+a[i-1]*a[i]*a[j];
	            for(int k=i+1;k<j;k++){
	                int t=m[i][k]+m[k+1][j]+a[i-1]*a[k]*a[j];
	                if(t<m[i][j])
	                    m[i][j]=t;
	            }
			}
		}
	}

}
 