
import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestCommonSubsequence {
	
	int max(int x, int y)
	{
		return x > y ? x : y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		LongestCommonSubsequence obj = new LongestCommonSubsequence();
		int ans = obj.LCS(str1, str2);
		System.out.println(ans);
	}
	
	
	public int LCS(String str1, String str2) {
		
		int len1 = str1.length();
		int len2 = str2.length();
		int [][]dp = new int[len1+1][len2+1];
		
		for(int iter = 0; iter <= len1; iter++)
		{
			for(int jter = 0; jter <= len2; jter++)
			{
				if(iter == 0 || jter == 0)
				{
					dp[iter][jter] = 0;
				}
				else if(str1.charAt(iter-1) == str2.charAt(jter-1))
				{
					dp[iter][jter] = dp[iter-1][jter-1] + 1;
				}
				else 
				{
					dp[iter][jter] = max(dp[iter-1][jter], dp[iter][jter-1]);
				}
			}
		}
		return dp[len1][len2];
	}

}
