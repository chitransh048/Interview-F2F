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

public class JumpGameOne {

	/**
	 * @param args
	 */
	int max(int x, int y)
	{
		return x > y ? x : y;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		ArrayList<Integer> ai = new ArrayList<Integer>();
		for(int iter = 0; iter < number; iter++)
		{
			ai.add(input.nextInt());
		}
		JumpGameOne obj = new JumpGameOne();
		int ans = obj.findMinSteps(ai);
		System.out.println(ans);
	}
	public int findMinSteps(ArrayList<Integer> A)
	{
		if(A.get(0) == 0)
		{
			return -1;
		}
		int start = 0;
		int end = 0;
		int lastPos = A.size()-1;
		int steps = 0;
		while(end < lastPos)
		{
			steps++;
			int maxend = end+1;
			for(int iter = start; iter <= end; iter++)
			{
				if(iter + A.get(iter) >= lastPos)
				{
					return steps;
				}
				maxend = max(maxend, iter+A.get(iter));
			}
			start = end+1;
			end = maxend;
			if(end == 0)
			{
				return -1;
			}
		}
		return steps;
	}
}
