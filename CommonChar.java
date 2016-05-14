import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/*
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.
For the first test case, abc -> abb -> aba.
For the second test case, abcba is already a palindromic string.
For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
For the fourth test case, cba -> bba -> aba.*/
public class CommonChar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfStrings = Integer.parseInt(scanner.nextLine());
        Set<Character> finalSet = new HashSet<>();
        Set<Character> set;
        String str;
        for(int i=0 ; i < 26 ; i++)
        	finalSet.add((char) (i+97));
        while(noOfStrings > 0){
            str = scanner.nextLine();
            set = new HashSet<>();
    		for(char c : str.toCharArray())
    			set.add(c);
            finalSet.retainAll(set);
            noOfStrings--;
        }
		scanner.close();
		System.out.println(finalSet.size());
//		for(char c : finalSet)
//			System.out.println(c);
    }

}
