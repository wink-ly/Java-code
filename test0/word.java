package test0;

import java.util.Scanner;

public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[10];
		int flag1,flag2,flag3;
		flag1=flag2=flag3=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "horse";
		String str2 = "cat  ";
		String str3 = "pig  ";
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
		}
		for(int j=0;j<str.length();j++) {
			if(ch[j]==(str1.charAt(j))) {
				flag1++;
			}
			if(ch[j]==(str2.charAt(j))) {
				flag2++;
			}
			if(ch[j]==(str3.charAt(j))) {
				flag3++;
			}
		}
		if(flag1>=3) {
			System.out.println("horse");
		}
		if(flag2>=2) {
			System.out.println("cat");
		}
		if(flag3>=2) {
			System.out.println("pig");
		}
	}
}
