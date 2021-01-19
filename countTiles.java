import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    long countTiles(int n) {
        long mod = 1000000007;
        long dp[] = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = ((dp[i-1] % mod) + (dp[i-2] % mod)) % mod;
            }
        return dp[n];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Codechef c = new Codechef();
		int n = Integer.parseInt(br.readLine());
		System.out.println(c.countTiles(n));
	}
}