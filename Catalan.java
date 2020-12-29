import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    long[]  Catalan(int n) {
        long mod = 1000000007;
        long dp[] = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            long res = 0;
            for(int j = 0; j < i; j++) {
                long temp = ((dp[j] % mod) * (dp[i-j-1] % mod)) % mod;
                res = ((res % mod) + (temp % mod)) % mod;
            }
            dp[i] = res;
        }
        return dp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a[];
		Codechef c = new Codechef();
		int n = Integer.parseInt(br.readLine());
		a=c.Catalan(n);
		for(long x:a)
		  System.out.println(x);
		//System.out.println(c.uglyNumbers(n));
	}
}