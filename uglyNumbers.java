/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    int  uglyNumbers(int n) {
        int a[] = new int [n];
        a[0] = 1;
        int pos = 1,i2 = 0,i3 = 0,i5 = 0;
        int next_mul_2 = 2;
        int next_mul_3 = 3;
        int next_mul_5 = 5;
        int next_ugly_no = 1;
        while(pos < n) {
            next_ugly_no = Math.min(next_mul_2,Math.min(next_mul_3,next_mul_5));
            a[pos] = next_ugly_no;
            if(next_ugly_no == next_mul_2) {
                i2++;
                next_mul_2 = a[i2] * 2;
            }
            if(next_ugly_no == next_mul_3) {
                i3++;
                next_mul_3 = a[i3] * 3;
            }
            if(next_ugly_no == next_mul_5) {
                i5++;
                next_mul_5 = a[i5] * 5;
            }
            pos++;
        } 
        return a[n-1];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[];
		Codechef c = new Codechef();
		int n = Integer.parseInt(br.readLine());
		//a=c.uglyNumbers(n);
		//for(int x:a)
		  //  System.out.println(x);
		System.out.println(c.uglyNumbers(n));
	}
}
\