/*Given an integer, write a function to determine if it is a power of two.*/
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {	
		System.out.println("Input a number-->");
		Scanner scanner = new Scanner(System.in);		
		int num= scanner.nextInt();
		scanner.close();
		System.out.println("Is "+ num +" power of two?---> "+ isPowerOfTwo(num));
	}

	public static boolean isPowerOfTwo(int n) {	
		//2's power will be of the form 1000 and a number less will be of form 111
		//So, their bitwise And will result 0. Need to add separate check for 0 as it will also produce 0.
		return n>0 && (n & (n-1)) == 0;
	}
}
