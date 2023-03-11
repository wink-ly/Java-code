package test12;

import java.util.Scanner;

public class book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String[] name = new String[n + 1];
			int[] num = new int[n + 1];
			float[] value = new float[n + 1];
			for (int i = 1; i <= n; i++) {
				name[i] = sc.next();
				num[i] = sc.nextInt();
				value[i] = sc.nextFloat();
			}
			Sort(name, num, value, n);
		}
	}

	private static void Sort(String[] name, int[] num, float[] value, int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n + 1 - i; j++)
				if (num[j] < num[j + 1]) {
					String s = name[j];
					name[j] = name[j + 1];
					name[j + 1] = s;

					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					float te2 = value[j];
					value[j] = value[j + 1];
					value[j + 1] = te2;
				} else if (num[j] == num[j + 1] && value[j] > value[j + 1]) {
					String s = name[j];
					name[j] = name[j + 1];
					name[j + 1] = s;

					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					float te2 = value[j];
					value[j] = value[j + 1];
					value[j + 1] = te2;
				}
		}
		for (int i = 1; i <= n; i++) {
			String str = name[i] + " " + num[i] + " " + String.format("%1.2f", value[i]);
			System.out.println(str);
		}
	}

}
