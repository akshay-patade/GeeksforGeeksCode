import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    int dp[][] = {{-1, -1, -1,-1},
                   {-1, -1, -1,-1},
                   {-1, -1, -1,-1},
                    {-1, -1, -1,-1}
    };
    
  int mat[][] = {{10, 33, 13, 15},
                  {22, 21, 04, 1},
                  {5, 0, 2, 3},
                  {0, 6, 14, 2}};
                   
    int goldMine(int n,int m) {
        if(n > mat.length-1 || m > mat[0].length-1 || n < 0 || m < 0)
            return 0;
        else if (dp[n][m] == -1) {
            int temp;
            temp = mat[n][m] + Math.max(goldMine(n,m+1),Math.max(goldMine(n-1,m+1),goldMine(n+1,m+1)));
            dp[n][m] = temp;
        }
        return dp[n][m];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int max = -1;
		Codechef c = new Codechef();
		for(int i = 0; i < c.mat.length; i++) {
		    int result =c.goldMine(i,0);
		    max = Math.max(result,max);
		}
		System.out.println(max);
	}
}