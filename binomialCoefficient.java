import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    long  binomialCoefficient(int n,int k) {
        long mod = 1000000007;
        long dp[] = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = (i * dp[i-1]) % mod;
        }
        return dp[n] / (dp[k] * dp[n-k]);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a[];
		Codechef c = new Codechef();
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		//a=c.binomialCoefficient(n,k);
		//for(long x:a)
		  //System.out.println(x);
		System.out.println(c.binomialCoefficient(n,k));
	}
}