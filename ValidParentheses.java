/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/
public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println("Are parentheses sequence  (){}[]  valid--->"+ isValid("(){}[]"));
		System.out.println("Are parentheses sequence  [(){}]  valid--->"+ isValid("[(){}]"));
		System.out.println("Are parentheses sequence  [({})]  valid--->"+ isValid("[({})]"));
		System.out.println("Are parentheses sequence  \"\"  valid--->"+ isValid(""));
		System.out.println("Are parentheses sequence  [  valid--->"+ isValid("["));
		System.out.println("Are parentheses sequence  (){}[]]  valid--->"+ isValid("(){}[]]"));
	}       
	
	public static boolean isValid(String s){
		int remLength=0;
		
		while(remLength != s.length()) {
			remLength = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } //remLength will be equal to string length, if no replacements are done
		return s.length()==0;
	}
}
