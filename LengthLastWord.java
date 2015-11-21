import java.util.Scanner;
/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.*/
public class LengthLastWord {

	public static void main(String[] args) {
		System.out.println("Input a String--->");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		System.out.println("Length of last word--->"+lengthOfLastWord(s));

	}
	
	public static int lengthOfLastWord(String s) {
        if(s==null || "".equals(s))
            return 0;
        String[] strArr = s.split(" ");
        return strArr.length>0?strArr[strArr.length - 1]!=null && !"".equals(strArr[strArr.length - 1])?
                strArr[strArr.length - 1].length():0:0;
    }

}
