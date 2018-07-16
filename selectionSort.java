import java.lang.*;
import java.util.*;
import java.io.*;

public class DataStr 
{
	public static void main(String[] args) 
	{
        ArrayList<Integer> ai = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int iter = 0; iter < number; iter++)
        {
            int data = input.nextInt();
            ai.add(data);
        }
        boolean mila = false;
        for(int iter = 0; iter < ai.size()-1; iter++)
        {
        	int min_index = iter;
        	for(int jter = iter+1; jter < ai.size(); jter++)
        	{
        		if(ai.get(min_index) > ai.get(jter))
        		{
        			min_index = jter;
        			mila = true;
        		}
        	}
        	if(mila) 
        	{
	        	int temp = ai.get(iter);
	        	ai.set(iter, ai.get(min_index));
	        	ai.set(min_index, temp);
        	}
        }
        ListIterator iter = ai.listIterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
    }
}
