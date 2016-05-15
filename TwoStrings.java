import java.util.Scanner;
//You are given two strings,  and . Find if there is a substring that appears in both  and .
//Sample Input
//2
//hello
//world
//hi
//world
//Sample Output
//YES
//NO
//For the 1st test case, the letter o is common between both strings, hence the answer YES. (Furthermore, the letter l is also common, but you only need to find one common substring.) 
//For the 2nd test case, hi and world do not have a common substring, hence the answer NO.
public class TwoStrings {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        while(noOfTestCases>0){
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(substrExists(first,second));
            noOfTestCases--;
        }
        scanner.close();
    }
    
    private static String substrExists(String first, String second){
        for(char c : first.toCharArray())          
            if(second.indexOf(String.valueOf(c)) > -1)
            return "YES";
        return "NO";
    }

}
