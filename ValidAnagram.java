import java.util.Scanner;
/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.*/


public class ValidAnagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String--->");
		String s= scanner.nextLine();
		System.out.println("Enter second String--->");
		String t= scanner.nextLine();
		scanner.close();
		System.out.println("Valid Anagram--->"+isAnagram(s,t));
	}

	public static boolean isAnagram(String s, String t) {
		int[] charArr= new int[26];
		for(int i=0; i < s.length(); i++){
			int index=s.charAt(i)-97;
			charArr[index]=charArr[index]+1;			
		}
		for(int i=0; i < t.length(); i++){
			int index = t.charAt(i)-97;
			if(charArr[index]==0)
				return false;
			else
				charArr[index]=charArr[index]-1;
		}
		int a=0;
		for(int i =0; i<charArr.length;i++){
			a+=charArr[i];
		}
		return a==0? true: false;		
	}

}
