package test12;

import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] coins = { 1, 5, 10, 25 };
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] dp = new int[n + 1];
			dp[0] = 0;
			for (int i = 1; i <= n; i++)
				dp[i] = n + 1;
			for (int coin : coins) {
				for (int i = 1; i <= n; i++) {
					if (i >= coin)
						dp[i] = Math.min(dp[i], dp[i - coin] + 1);
				}
			}
			int minCoin = dp[n] != n + 1 ? dp[n] : -1;
			System.out.println(minCoin);
		}
	}

}
