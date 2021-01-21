import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    int mat [] = {3, 34, 4};
    
    boolean subsetSum(int sum,int visited[],int pos,boolean dp[]) {
        if(sum == 0)
            return true;
        else if (pos < 0)
            return false;
        else if(sum < 0)
            return false;
        else if(visited[sum] == -1) {
            dp[sum] = subsetSum(sum-mat[pos],visited,pos-1,dp) || subsetSum(sum,visited,pos-1,dp);
            visited[sum] = 1;
        }
        return dp[sum];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		Codechef c = new Codechef();
		int sum = sc.nextInt();
		int visited[] = new int[sum+1];
		for(int i = 1; i <= sum; i++)
            visited[i] = -1;
        boolean dp[] = new boolean[sum+1];
        dp[0] = true;
		System.out.println(c.subsetSum(sum,visited,c.mat.length-1,dp));
	}
}