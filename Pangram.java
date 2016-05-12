import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Given a sentence ss, tell Roy if it is a pangram or not.
//
//Input Format
//
//Input consists of a string ss.
//
//Constraints 
//Length of ss can be at most 103103 (1≤|s|≤103)(1≤|s|≤103) and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.
//
//Output Format
//
//Output a line containing pangram if ss is a pangram, otherwise output not pangram.
//
//Sample Input
//
//Input #1
//
//We promptly judged antique ivory buckles for the next prize    
//Input #2
//
//We promptly judged antique ivory buckles for the prize    
//Sample Output
//
//Output #1
//
//pangram
//Output #2
//
//not pangram


public class Pangram {

	public static void main(String[] args) {
		System.out.println("Enter a sentence to determin if it is a pangram-->");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		System.out.println(str.trim()+" is " +isPangram(str));
	}
	
	private static String isPangram(String str){
		char[] charArr = str.toLowerCase().replaceAll("[^a-z]+", "").toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c: charArr){
			set.add(c);
		}
		
		if(set.size() == 26)
			return "pangram";
		else 
			return "not pangram";
	}

}
