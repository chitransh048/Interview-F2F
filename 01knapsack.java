
import java.util.*;
import java.io.*;
import java.lang.*;

public class DynamicProgramming 
{
	int max(int a, int b)
	{
		return a > b ? a : b;
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int W = input.nextInt();
		ArrayList<Integer> Values = new ArrayList<Integer>();
		for(int iter = 0; iter < number; iter++)
		{
			Values.add(input.nextInt());
		}
		ArrayList<Integer> Weight = new ArrayList<Integer>();
		for(int iter = 0; iter < number; iter++)
		{
			Weight.add(input.nextInt());
		}
		
		DynamicProgramming dp = new DynamicProgramming();
		int ans = dp.knapSack(number, W, Values, Weight);
		System.out.println(ans);
	}
	
	public int knapSack(int number, int W, ArrayList<Integer> Values, ArrayList<Integer> Weight)
	{
		int [][]table = new int[number+1][W+1];
		for(int iter = 0; iter <= number; iter++)
		{
			for(int w = 0; w <= W; w++)
			{
				if(iter == 0 || w == 0)
				{
					table[iter][w] = 0;
				}
				else if(Weight.get(iter-1) <= w)
				{
					table[iter][w] = max(Values.get(iter-1) + table[iter-1][w - Weight.get(iter-1)], table[iter-1][w]);
				}
				else
				{
					table[iter][w] = table[iter-1][w];
				}
			}
		}
		
		return table[number][W];
		
	}
}
