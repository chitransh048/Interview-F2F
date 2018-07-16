/**
 * 
 */

/**
 * @author Avinash
 *
 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class longestPalindromicSubsequence 
{
	/**
	 * @param args
	 */
	int max(int x, int y)
	{
		return x > y ? x : y;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.next();
		longestPalindromicSubsequence obj = new longestPalindromicSubsequence();
		int ans = obj.LongestPalindromicSubsequence(str);
		System.out.println(ans);
	}
	public int LongestPalindromicSubsequence(String str)
	{
		int len = str.length();
		int [][]dp = new int[len][len];
		for(int iter = 0; iter < len ;iter++)
		{
			dp[iter][iter] = 1;
		}
		for(int kter = 2; kter <= len; kter++)
		{
			for(int iter = 0; iter < len-kter+1; iter++)
			{
				int jter = iter+kter-1;
				if(str.charAt(iter) == str.charAt(jter) && kter == 2)
				{
					dp[iter][jter] = 2;
				}
				else if(str.charAt(iter) == str.charAt(jter))
				{
					dp[iter][jter] = dp[iter+1][jter-1] + 2;
				}
				else
				{
					dp[iter][jter] = max(dp[iter][jter-1], dp[iter+1][jter]);
				}
			}
		}
		return dp[0][len-1];  
	}
}
