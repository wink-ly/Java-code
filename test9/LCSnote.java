package test9;

import java.util.Scanner;

public class LCSnote {

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
			System.out.println(fun(ch1, ch2, x-1, y-1));
		}
	}
	static int fun(char[] ch1,char[] ch2,int x,int y) {
		if(x<0||y<0)
			return 0;
		if(c[x][y]==0) {
			if(ch1[x]==ch2[y])
				c[x][y]=fun(ch1, ch2, x-1, y-1)+1;
			else
				c[x][y]=Max(fun(ch1,ch2,x-1,y),fun(ch1,ch2,x,y-1));
		}
		return c[x][y];
	}
	
	static int Max(int a, int b) {
		return a>b?a:b;
	}
}
