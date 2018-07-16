import java.lang.*;
import java.util.*;
import java.io.*;
public class DataStr 
{
	public void  merge(int[] arr, int low, int mid, int high)
	{
		int n = mid-low+1;
		int m = high-mid;
		
		int[] L1 = new int[n];
		int[] L2 = new int[m];
		for(int iter = 0; iter < n; iter++)
		{
			L1[iter] = arr[iter+low];
		}
		for(int iter = 0; iter < m; iter++)
		{
			L2[iter] = arr[mid+iter+1];
		}
		
		int iter = 0;
		int jter = 0;
		int kter = low;
		while(iter < n && jter < m)
		{
			if(L1[iter] <= L2[jter])
			{
				arr[kter] = L1[iter];
				iter++;
				kter++;
			}
			else 
			{
				arr[kter] = L2[jter];
				jter++;
				kter++;
			}
		}
		while(iter < n)
		{
			arr[kter] = L1[iter];
			iter++;
			kter++;
		}
		while(jter < m)
		{
			arr[kter] = L2[jter];
			jter++;
			kter++;
		}
		return;
		
	}
    public void mergeSort(int[] arr, int low, int high) 
    {
    	if(low < high)
    	{
    		int mid = (low+high)/2;
    		mergeSort(arr, low, mid);
    		mergeSort(arr, mid+1, high);
    		merge(arr, low, mid, high);
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
       
        int[] arr = new int[ai.size()];
        ListIterator<Integer> iter = ai.listIterator();
        int i = 0;
        while(iter.hasNext())
        {
            arr[i++] = (int) iter.next();
        }
        
        obj.mergeSort(arr, 0, ai.size()-1);
        for(int it = 0; it < ai.size(); it++) {
        	System.out.print(arr[it] + " ");
        }
	}
}
