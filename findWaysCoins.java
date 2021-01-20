import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    int findWaysCoins(int denom[],int sum,int pointer) {
        int dp[] = new int[sum+1];
        dp[0] = 1;
        for(int i = 0; i < denom.length; i++) {
            for(int j = denom[i]; j <= sum; j++) {
                dp[j] += dp[j-denom[i]];
            }
        }
        return dp[sum];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		Codechef c = new Codechef();
		int denom[] = {1,2,3};
		int sum = sc.nextInt();
		System.out.println(c.findWaysCoins(denom,sum,denom.length-1));
	}
}