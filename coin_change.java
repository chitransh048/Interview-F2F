/**
 * 
 */

/**
 * @author Avinash
 *
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class CoinChangeProblem {

	/**
	 * @param args
	 */
	int min(int a, int b)
	{
		return a < b ? a : b;
	}
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
		int paisa = input.nextInt();
		CoinChangeProblem obj = new CoinChangeProblem();
		
		int ans = obj.coinChange(array, paisa);
		System.out.println(ans);
	}
	public int coinChange(ArrayList<Integer> array, int amount)
	{
		int mx = amount+1;
		int []dp = new int[amount+1];
		for(int iter = 0; iter <= amount; iter++)
		{
			dp[iter] = mx;
		}
		dp[0] = 0;
		for(int iter = 1; iter <= amount; iter++)
		{
			for(int jter = 0; jter < array.size(); jter++)
			{
				if(array.get(jter) <= iter)
				{
					dp[iter] = min(dp[iter], dp[iter-array.get(jter)] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}
