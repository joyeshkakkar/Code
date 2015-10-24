import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number-->");
		int num = Integer.parseInt(scanner.nextLine());
		scanner.close();		
		System.out.println("Number " + num+ " is palindrome?--->"+isPalindrome(num));
		System.out.println("Number 1 is palindrome?--->"+isPalindrome(1));
		System.out.println("Number 131 is palindrome?--->"+isPalindrome(131));
		System.out.println("Number 121 is palindrome?--->"+isPalindrome(121));
		System.out.println("Number 9999 is palindrome?--->"+isPalindrome(9999));
		System.out.println("Number 9885 is palindrome?--->"+isPalindrome(9885));
	}
	
	public static boolean isPalindrome(int x){
		int xx =x;
		int reverse =0;
		while(xx>0){
			if(reverse > Integer.MAX_VALUE/10 ||	reverse < Integer.MIN_VALUE/10)
				return false;
			reverse= reverse*10+xx%10;
			xx/=10;
		}
		return x==reverse;
	}

}
