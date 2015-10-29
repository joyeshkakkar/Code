import java.util.Scanner;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number--->");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println("Excel column for number " +num+" is--->"+convertToTitle(num));
		System.out.println("Excel column for number 1 is--->"+convertToTitle(1));
		System.out.println("Excel column for number 2 is--->"+convertToTitle(2));
		System.out.println("Excel column for number 25 is--->"+convertToTitle(25));
		System.out.println("Excel column for number 26 is--->"+convertToTitle(26));
		System.out.println("Excel column for number 27 is--->"+convertToTitle(27));
		System.out.println("Excel column for number 24568 is--->"+convertToTitle(24568));
	}
	
	public static String convertToTitle(int n){
		StringBuilder sb=new StringBuilder();
		
		while(n>0){
			int a=n%26;
			n/=26;
			if (a==0){
				a=26;
				n--;
			}
			char c= (char) (a -1 + 'A');
			sb.append(c);
		}
		return sb.reverse().toString();
		
	}

}
