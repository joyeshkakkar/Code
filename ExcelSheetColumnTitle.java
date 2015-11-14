import java.util.Scanner;
/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */
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
		System.out.println("Excel column for number 676 is--->"+convertToTitle(676));
		System.out.println("Excel column for number 702 is--->"+convertToTitle(702));
		System.out.println("Excel column for number 703 is--->"+convertToTitle(703));
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
