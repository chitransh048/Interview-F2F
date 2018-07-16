//Decimal to binary number...
import java.util.*;
import java.lang.*;
import java.io.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String str = new String();
		while(number > 0) {
			str = (number%2 == 0 ? "0" : "1") + str;
			number /= 2;
		}
		System.out.println(str);
	}
}
