import java.util.Scanner;
/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How
 should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number-->");
		int num=scanner.nextInt();
		scanner.close();	
		int y= -128%10;
		System.out.println(y);
		System.out.println("Zigzag String-->"+reverse(num));
	}
	
	public static int reverse(int x) {
		int result=0;		
		while(x!=0){
			if(result > Integer.MAX_VALUE/10 ||	result < Integer.MIN_VALUE/10)
				return 0;
			result = result*10+x%10;
			x=x/10;
		}
        return result;
    }
}
