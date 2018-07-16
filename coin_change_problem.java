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
		int []dp = new int[amount+1];
		for(int iter = 0; iter <= amount; iter++)
		{
			dp[iter] = 0;
		}
		dp[0] = 1;
		for(int iter = 0; iter < array.size(); iter++)
		{
			for(int jter = array.get(iter); jter <= amount; jter++)
			{
				dp[jter] = dp[jter] + dp[jter-array.get(iter)];
			}
		}
		return dp[amount];
	}
}
