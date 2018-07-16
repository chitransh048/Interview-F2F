/**
 * 
 */

/**
 * @author Avinash
 *
 */
import java.lang.*;
import java.io.*;
import java.util.*;

public class LongestDecreasingSubsequence 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int iter = 0; iter < number; iter++)
		{
			array.add(input.nextInt());
		}
		LongestDecreasingSubsequence obj = new LongestDecreasingSubsequence();
		int ans = obj.LDS(array);
		System.out.println(ans);
	}
	public int LDS(ArrayList<Integer> A)
	{
		int len = A.size();
		int[] dp = new int[len];
		for(int iter = 0; iter < len; iter++)
		{
			dp[iter] = 1;
		}
		for(int iter = len-2; iter >= 0; iter--)
		{
			for(int jter = len-1; jter > iter; jter--)
			{
				if(A.get(iter) > A.get(jter) && dp[iter] < dp[jter] +1)
				{
					dp[iter] = dp[jter] +1;
				}
			}
		}
		int mx = 0;
		for(int iter = 0; iter < len; iter++)
		{
			if(mx < dp[iter])
			{
				mx = dp[iter];
			}
		}
		return mx;
	}
}
