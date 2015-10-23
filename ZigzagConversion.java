import java.util.Scanner;
/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".*/

public class ZigzagConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string--->");;
		String input=scanner.nextLine();
		System.out.println("Enter the number of rows-->");
		int numOfRows=Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		System.out.println("Zigzag String-->"+zigzagConversion(input, numOfRows));
	}
	
	public static String zigzagConversion(String str, int numOfRows){
		StringBuilder result = new StringBuilder();
		StringBuilder[] sba = new StringBuilder[numOfRows];
		for(int i=0;i<sba.length;i++){
			sba[i]=new StringBuilder();
		}
		
		int i=0;
		
		while(i<str.length()){
			for(int n=0; n<numOfRows && i<str.length(); n++){
				sba[n].append(str.charAt(i++));
			}
			for(int n=0; n<numOfRows -2 && i<str.length();n++){
				sba[numOfRows-2-n].append(str.charAt(i++));
			}
		}
		for(StringBuilder sb: sba){
			result.append(sb);
		}
		return result.toString();
	}

}
