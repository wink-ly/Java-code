package test0;

import java.util.Scanner;

public class RGB {

	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replace("#", "");
		for (int i = 0; i < s.length(); i++)
			str += fun(String.valueOf(s.charAt(i))) + ' ';
		System.out.println(str);
	}

	public static String fun(String s) {
		Integer i = Integer.parseInt(s, 16);
		String str = Integer.toBinaryString(i);
		for (int n = str.length(); n != 4; n++)
			str = "0" + str;
		return str;
	}
}