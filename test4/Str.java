package test4;

import java.util.Scanner;

public class Str {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while(sc.hasNext()) {
			String str = sc.nextLine();
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<str.length()&&j!=i;j++){
					if(str.charAt(i)==str.charAt(j)) 
						flag++;
				}
			}
			if(flag==0)
			    System.out.printf("True\n");
			else {
				System.out.printf("False\n");
				flag=0;
			}
		}
	}
}
