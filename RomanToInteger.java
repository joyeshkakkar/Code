import java.util.HashMap;
import java.util.Map;
/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.*/

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println("Roman to int for IX--->"+romanToInt("IX"));//9
		System.out.println("Roman to int for MCMLIV--->"+romanToInt("MCMLIV"));//1954
		System.out.println("Roman to int for MCMXC--->"+romanToInt("MCMXC"));//1990
		System.out.println("Roman to int for MMXIV--->"+romanToInt("MMXIV"));//2014
		System.out.println("Roman to int for XLIX--->"+romanToInt("XLIX"));//49
		System.out.println("Roman to int for V--->"+romanToInt("V"));//5
	}
	
	public static int romanToInt(String s){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result=0;
		if(s.length()==1)
			return map.get(s.charAt(0));
		for(int i=0; i < s.length()-1; i++){
			if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
				result-=map.get(s.charAt(i));
			else
				result+=map.get(s.charAt(i));
		}
		result+=map.get(s.charAt(s.length()-1));
		return result;
	}

}
