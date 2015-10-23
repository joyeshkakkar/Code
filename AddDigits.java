import java.util.Scanner;
/*Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?*/


public class AddDigits {

	public static void main(String[] args) {
		int num;
		String input;
		System.out.println("Enter a positive number--->");		
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
	    scanner.close();
	    num=Integer.parseInt(input);
		System.out.println(addDigits(num));
	}
	
	private static int addDigits(int num) {
	    if(num==0) return 0;
	    int x=num%9;
	    return x==0?9:x;
	}

}
