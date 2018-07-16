
import java.lang.*;
import java.io.*;
import java.util.*;

public class LongestPalindromicString 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str = input.next();
		LongestPalindromicString obj = new  LongestPalindromicString();
		String ans = obj.LPS(str);
		System.out.println(ans);
	}
	public String LPS(String str)
	{
		int len = str.length();
		int start = 0;
		int maxLength = 1;
		int high, low;
		for(int iter = 1; iter < len; iter++)
		{
			low = iter-1;
			high = iter;
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high))
			{
				if(high-low+1 > maxLength)
				{
					maxLength = high-low+1;
					start = low;
				}
				--low;
				++high;
			}
			
			low = iter-1;
			high = iter+1;
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high))
			{
				if(high - low + 1 > maxLength)
				{
					maxLength = high-low+1;
					start = low;
				}
				--low;
				++high;
			}
		}
		return str.substring(start,start+maxLength);
	}
}
