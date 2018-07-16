//Reverse A Number...
import java.util.*;
import java.lang.*;
import java.io.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int reverse_Number = 0;
		while(number > 0) 
		{
			reverse_Number = reverse_Number*10 + number%10;
			number /= 10;
		}
		System.out.println(reverse_Number);
	}
}