package test3;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			char ch1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
					's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			char ch[] = new char[n];
			for (int i = 0; i < n; i++) {
				ch[i] = ch1[i];
			}
			perm(ch, 0, n - 1);
		}
	}

	static void perm(char ch[], int n, int k) {
		if(n==k) {
			for(int i = 0;i<=k;i++) 
				System.out.printf("%c",ch[i]);
			System.out.println();
		}
		for (int i = n; i <= k; i++) {
			swap(ch, n, k);
			perm(ch, n + 1, k);
			swap(ch, k, n);
		}
	}

	static void swap(char ch[], int n, int k) {
		int temp;
		for (int i = n; i <= k; i++) {
			temp = ch[n];
			ch[n] = ch[i];
			ch[i] = (char) temp;
		}
	}
}
