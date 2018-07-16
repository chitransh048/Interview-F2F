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
public class LIS {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int number = input.nextInt();
		for(int iter = 0; iter < number; iter++)
		{
			array.add(input.nextInt());
		}
		LIS obj = new LIS();
		int ans = obj.LongestIncreasingSubsequence(array);
		System.out.println(ans);
	}
	
	public int LongestIncreasingSubsequence(ArrayList<Integer> A)
	{
		int len = A.size();
		int []dp = new int[len];
		for(int iter = 0; iter < len; iter++)
		{
			dp[iter] = 1;
		}
		for(int iter = 1; iter < len; iter++)
		{
			for(int jter = 0; jter < iter; jter++)
			{
				if(A.get(iter) > A.get(jter) && dp[iter] < dp[jter]+1)
				{
					dp[iter] = dp[jter] +1;
				}
			}
		}
		return dp[len-1];
	}
}
