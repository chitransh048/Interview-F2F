import java.lang.*;
import java.util.*;
import java.io.*;

public class DataStr 
{
	void swap(int a, int b)
	{
		a = a^b;
		b = a^b;
		a = a^b;
	}
	public int partition(ArrayList<Integer> A, int low, int high)
	{
		int pivot = A.get(high);
		int iter = low-1;
		for(int jter = low; jter < high; jter++)
		{
			if(A.get(jter) <= pivot)
			{
				iter++;
				swap(A.get(iter), A.get(jter));
			}
		}
		int temp = A.get(iter+1);
		A.set(iter+1, A.get(high));
		A.set(high, temp);
		return iter+1;
	}
    public void quickSort(ArrayList<Integer> A, int low, int high) 
    {
    	if(low < high)
    	{
    		int pi = partition(A, low, high);
    		quickSort(A, low, pi-1);
    		quickSort(A, pi+1, high);
    	}
	}
	public static void main(String[] args) 
	{
        ArrayList<Integer> ai = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Print the number of elements :-  ");
        int number = input.nextInt();
        for(int iter = 0; iter < number; iter++)
        {
            int data = input.nextInt();
            ai.add(data);
        }
        DataStr obj = new DataStr();
        obj.quickSort(ai, 0, ai.size()-1);
        ListIterator iter = ai.listIterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
	}
}
