import java.util.Scanner;
//
//Input Format 
//The first line will contain an integer, , representing the number of test cases. Each test case will contain a string having length , which will be concatenation of both the strings described above in the problem.The given string will contain only characters from  to .
//
//Output Format 
//An integer corresponding to each test case is printed in a different line, i.e. the number of changes required for each test case. Print  if it is not possible.
//
//Sample Input
//6
//aaabbb
//ab
//abc
//mnop
//xyyx
//xaxbbbxx
//Sample Output
//3
//1
//-1
//2
//0
//1
//Explanation 
//Test Case #01: We have to replace all three characters from the first string to make both of strings anagram. Here,  = "aaa" and  = "bbb". So the solution is to replace all character 'a' in string a with character 'b'. 
//
//Test Case #02: You have to replace 'a' with 'b', which will generate "bb". 
//
//Test Case #03: It is not possible for two strings of unequal length to be anagram for each other. 
//
//Test Case #04: We have to replace both the characters of first string ("mn") to make it anagram of other one. 
//
//Test Case #05:  and  are already anagram to each other. 
//
//Test Case #06: Here S1 = "xaxb" and S2 = "bbxx". He had to replace 'a' from S1 with 'b' so that S1 = "xbxb" and we can rearrange its letter to "bbxx" in order to get S2.

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        while(noOfTestCases > 0){
            String s = scanner.nextLine();
            System.out.println(makeAnagram(s));
            noOfTestCases--;
        }
		scanner.close();
	}
	
	private static int makeAnagram(String s){
		if (s.length()%2 != 0)
			return -1;
		int count=0;
		String first = s.substring(0,s.length()/2);
        String second = s.substring(s.length()/2,s.length());
		for(int i=0; i < s.length()/2; i++){
                int index = second.indexOf(first.charAt(i));
                if(index!=-1)
                    second=second.substring(0,index)+second.substring(index+1);   
                else
                    count++;
		}
		return count;
	}
}
