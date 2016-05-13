import java.util.Scanner;
/*Given a string containing characters,change it into a string with alternating characters.
Find min number of deletions.
AAAA  A, 3 deletions
BBBBB  B, 4 deletions
ABABABAB  ABABABAB, 0 deletions
BABABA  BABABA, 0 deletions
AAABBB  AB, 4 deletions because to convert it to AB we need to delete 2 A's and 2 B's*/
public class AlternatingCharacters {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        while(noOfTestCases > 0){
            String s = scanner.nextLine();
            System.out.println(alternatingCharacters(s));
            noOfTestCases--;
        }
		scanner.close();
    }
	private static int alternatingCharacters(String s){
		char[] charArr = s.toCharArray();
		int deletions = 0;
		for(int i=0; i < charArr.length - 1; i++){
			if(charArr[i] == charArr[i+1]){
				deletions++;
			}
		}
		return deletions;
	}
}
