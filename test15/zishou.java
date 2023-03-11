package test15;

import java.util.Scanner;

public class zishou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
//			boolean flag = false;
//			for (int i = 1; i <= n; i++) {
//				int j = i;
//				long temp = (long) i * i;
//				while (j > 0) {
//					if (j % 10 == temp % 10) {
//						j = j / 10;
//						temp = temp / 10;
//						flag = true;
//					} else {
//						flag = false;
//						break;
//					}
//				}
//				if (flag == true)
//					count++;
//			}
			for (int i = 0; i < n; i++) {
				if (i == 0)
					count = 1;
				if ((i % 10 == 0) || (i % 10 == 0) || (i % 10 == 5) || (i % 10 == 6)) {
					long temp = (long) i * i;
					String str1 = String.valueOf(i);
					String str2 = String.valueOf(temp);
					 if (str2.indexOf(str1, str2.length() - str1.length()) != -1)
						count++;
				}
			}
			System.out.println(count);
		}
	}

}
