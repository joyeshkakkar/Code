import java.util.Scanner;
/*
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.
For the first test case, abc -> abb -> aba.
For the second test case, abcba is already a palindromic string.
For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
For the fourth test case, cba -> bba -> aba.*/
public class MakePalindrome {

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        while(noOfTestCases > 0){
            String s = scanner.nextLine();
            System.out.println(makePalindrome(s));
            noOfTestCases--;
        }
		scanner.close();
    }
	private static int makePalindrome(String s){
		char[] charArr = s.toCharArray();
		int deletions = 0;
		for(int i=0, j=charArr.length-1; i <= charArr.length/2 && j >= charArr.length/2; i++, j--){
			deletions+= Math.abs(charArr[j] - charArr[i]);
		}
		return deletions;
	}

}
