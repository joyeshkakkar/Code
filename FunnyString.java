import java.util.Scanner;
//Suppose you have a String, , of length  that is indexed from  to . You also have some String, , that is the reverse of String .  is funny if the condition  is true for every character from  to .
//
//Note: For some String ,  denotes the ASCII value of the  -indexed character in . The absolute value of an integer, , is written as .
//
//Sample Input
//
//2
//acxz
//bcxz
//Sample Output
//
//Funny
//Not Funny
//Explanation
//
//Test Case 0:  
// 
// 
// 
//As each comparison is equal, we print .
//
//Test Case 1:  
//, but  
//At this point, we stop evaluating  (as ) and print .
public class FunnyString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        while(noOfTestCases > 0){
            String s = scanner.nextLine();
            System.out.println(whetherFunny(s));
            noOfTestCases--;
        }
		scanner.close();
	}
	
	private static String whetherFunny(String s){
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1 ; i >=0 ; i--)
			sb.append(s.charAt(i));
		char[] strCharArr = s.toCharArray();
		char[] revCharArr = sb.toString().toCharArray();
		for(int i=1; i < s.length();  i++ )
			if(Math.abs(strCharArr[i] - strCharArr[i-1]) != Math.abs(revCharArr[i] - revCharArr[i-1]))
				return "Not Funny";
	
		return "Funny";
	}

}
