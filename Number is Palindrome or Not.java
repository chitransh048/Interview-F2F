//Palindrome check...
import java.util.*;
import java.lang.*;
import java.io.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int copy_Number = number;
		int reverse_Number = 0;
		while(number > 0) 
		{
			reverse_Number = reverse_Number*10 + number%10;
			number /= 10;
		}
		if(reverse_Number == copy_Number) {
			System.out.println("Yes they are palindrome");
		}
		else {
			System.out.println("No they are not palindrome");
		}
	}
}
