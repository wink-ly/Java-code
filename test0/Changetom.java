package test0;

import java.util.Scanner;

public class Changetom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		Changetom sc = new Changetom();
		String str = sc.replace(string, "Jack", "Rose", "Tom");
		System.out.println(str);
	}

	public String replace(String s, String s1, String s2, String s3) {
		if (s.contains(s1) && s.contains(s2)) {
			s = s.replaceAll(s1, s3);
			s = s.replaceAll(s2, s3);
		}
		return s;
	}

}
