import java.util.Scanner;

//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
//
//Note that 1 is typically treated as an ugly number.
public class UglyNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input the number to find out if it is ugly or not---> ");
		int number=scanner.nextInt();
		scanner.close();
		System.out.println(number + " is ugly?---> "+isUgly(number));

	}

	private static boolean isUgly(int num){
		if(num < 1)
			return false;
		else {
			for(int i = 2; i <= 5; i++){
				while(num%i == 0)
					num /= i;
			}
		}
		return num == 1;
	}
}
