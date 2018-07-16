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
        boolean swapped = true;
        for(int iter = ai.size()-2; iter >= 0 && swapped; iter--)
        {
        	swapped = false;
        	for(int jter = 0; jter < iter; jter++)
        	{
        		if(ai.get(jter) > ai.get(jter+1))
        		{
        			swapped = true;
        			int temp = ai.get(jter);
        			ai.set(jter, ai.get(jter+1));
        			ai.set(jter+1, temp);
        		}
        	}
        }
        
        ListIterator iter = ai.listIterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
    }
}
