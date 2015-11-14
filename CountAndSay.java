import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("System.in");
		int num= scanner.nextInt();
		scanner.close();

		System.out.println(countAndSay(num));


	}

	public static String countAndSay(int n) {
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		
		
		return null;
	}

}
