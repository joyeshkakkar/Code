import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//A happy number is a number defined by the following process: Starting with any positive integer, replace the number
//by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), 
//or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//
//Example: 19 is a happy number
//
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1


public class HappyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number to find out if it is happy or not---> ");
		int number=scanner.nextInt();
		scanner.close();
		System.out.println(number + " is happy?---> "+isHappy(number));
	}
	
	private static boolean isHappy(int num){
		if (num==1)
			return true;
		
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		while(true){		
			sum = 0;
			while(num>=1){
				sum += (num%10) * (num%10);
				num /= 10;
			}
			if (set.contains(sum))
				return sum == 1;
			else {
				set.add(sum);
				num = sum;
			}
		}
	}

}
