/*Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 */
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println("Output for A is-->"+titleToNumber("A"));
		System.out.println("Output for AAA is-->"+titleToNumber("AAA"));
		System.out.println("Output for Y is-->"+titleToNumber("Y"));
		System.out.println("Output for Z is-->"+titleToNumber("Z"));
		System.out.println("Output for AA is-->"+titleToNumber("AA"));
		System.out.println("Output for AZ is-->"+titleToNumber("AZ"));
		System.out.println("Output for AJHX is-->"+titleToNumber("AJHX"));//24568
	}

	public static int titleToNumber(String s) {
		int num=0;
		for(int i =0; i < s.length(); i++){
			num=num*26+s.charAt(i)- 'A' + 1;
		}
        return num;
    }
}
