import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dp = new int[1000001];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=2; i<= N; i++) {
			
			dp[i] = dp[i-1] + 1;
			if(i%2 == 0) dp[i] = dp[i] < dp[i/2] + 1 ? dp[i] : dp[i/2] + 1;
			if(i%3 == 0) dp[i] = dp[i] < dp[i/3] + 1 ? dp[i] : dp[i/3] + 1;
		}
		System.out.println(dp[N]);

	}

}
