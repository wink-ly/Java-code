package test1;

import java.util.Scanner;

public class seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[100];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			int n = 0;
			for(int i=0;i<str.length();i++) {
				ch[i] = str.charAt(i);
			}
			if(ch[0]!='0'&&str.length()!=1) {
				for (int i = 0; i < str.length(); i++) {
					n = n * 10 + ch[i] - '0';
					n = n % 17;
				}
				if (n == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}
		}
	}
}
