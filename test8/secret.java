package test8;

import java.util.Scanner;

public class secret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i+=8) {
			for(int j = compare(i+7, str.length()-1);j>=i;j--)
				System.out.print(ch[j]);
		}
	}
	static int compare(int a,int b) {
		return (a<b)?a:b;
	}
}
