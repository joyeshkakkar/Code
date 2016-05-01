import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String--->");
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Reversed String--->"+reverseString(scanner.nextLine()));
		scanner.close();
	}
	private static String reverseString(String s){
		StringBuilder sb = new StringBuilder();
		char[] charArr = s.toCharArray();
		for(int i = charArr.length;  i > 0; i--) {
			sb.append(charArr[i-1]);
		}
		return sb.toString();
	}
}
