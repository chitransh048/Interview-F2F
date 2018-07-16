/**
 * 
 */

/**
 * @author Avinash
 *
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class Bitonic {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int iter = 0; iter < number; iter++)
		{
			array.add(input.nextInt());
		}
		Bitonic obj = new Bitonic();
		int ans = obj.bitonicArray(array);
		System.out.println(ans);
	}
	
	public int bitonicArray(ArrayList<Integer> A)
	{
		int len = A.size();
		int[] dp1 = new int[len];
		for(int iter = 0; iter < len; iter++)
		{
			dp1[iter] = 1;
		}
		
		for(int iter = 1; iter < len; iter++)
		{
			for(int jter = 0; jter < iter; jter++)
			{
				if(A.get(iter) > A.get(jter) && dp1[iter] < dp1[jter] +1)
				{
					dp1[iter] = dp1[jter] +1;
				}
			}
		}
		int[] dp2 = new int[len];
		for(int iter = 0; iter < len; iter++)
		{
			dp2[iter] = 1;
		}
		for(int iter = len-2; iter >= 0; iter--)
		{
			for(int jter = len-1; jter > len; jter--)
			{
				if(A.get(iter) > A.get(jter) && dp2[iter] < dp2[jter] +1)
				{
					dp2[iter] = dp2[jter] +1;
				}
			}
		}
		
		int mx = dp1[0] + dp2[0] -1;
		for(int iter = 0; iter < len; iter++)
		{
			if(dp1[iter] + dp2[iter] - 1 > mx)
			{
				mx = dp1[iter] + dp2[iter] -1;
			}
		}
		return mx;
	}
}
