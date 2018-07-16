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
        //ai.set(0, 24);
        for(int iter = 1; iter < ai.size(); iter++)
        {
        	int key = ai.get(iter);
        	int jter = iter-1;
        	while(jter >= 0 && ai.get(jter) > key) {
        		ai.set(jter+1, ai.get(jter));
        		jter--;
        	}
        	ai.set(jter+1, key);
        }
        
        ListIterator iter = ai.listIterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
    }
}
