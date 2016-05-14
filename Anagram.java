import java.util.Scanner;

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

//6
//aaabbb
//ab
//abc
//mnop
//xyyx
//xaxbbbxx
//3
//1
//-1
//2
//0
//1
