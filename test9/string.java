package test9;

import java.util.Scanner;

public class string {

	static int[][] c = new int[100][100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String st1 = sc.next();
			char[] ch1 = new char[100];
			for (int i = 0; i < st1.length(); i++)
				ch1[i] = st1.charAt(i);
			String st2 = sc.next();
			char[] ch2 = new char[100];
			for (int i = 0; i < st2.length(); i++)
				ch2[i] = st2.charAt(i);
			int x = st1.length();
			int y = st2.length();
			System.out.println(fun(ch1, ch2, x, y));
		}
	}

	static int fun(char[] ch1, char[] ch2, int x, int y) {
		for(int i=1;i<=x;i++){
	        for(int j=1;j<=y;j++){
	            if(ch1[i-1]==ch2[j-1])
	                c[i][j]=c[i-1][j-1]+1;
	            else
	                c[i][j]=0;
	        }
	    }
	    int max=c[0][0];
	    for(int i=1;i<=x;i++){
	        for(int j=1;j<=y;j++){
	            if(max<c[i][j]){
	               max=c[i][j];
	            }
	        }
	    }
	    return max;
	}

}
