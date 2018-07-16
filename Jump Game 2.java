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
		if(ans == 1)
		{
			System.out.println("Yes you can go to the next end");
		}
		else
		{
			System.out.println("No you can not go to the next end");
		}
	}
	public int findMinSteps(ArrayList<Integer> A)
	{
		int lastPos = A.size()-1;
		for(int iter = A.size()-1; iter >= 0; iter--)
		{
			if(iter + A.get(iter) >= lastPos)
			{
				lastPos = iter;
			}
		}
		return lastPos == 0 ? 1 : 0;
	}
}
