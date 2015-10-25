
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = new String[]{"abcdef","abc","abcd","abcde"};
		
		System.out.println("Longest Common Prefix--->"+longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
			return "";		
		String lcp = strs[0];
		for(int i =1; i < strs.length; i++){
			StringBuilder sb = new StringBuilder();
			for(int j =0 ; j < Math.min(lcp.length(), strs[i].length()); j++){
				if(lcp.charAt(j)==strs[i].charAt(j))
					sb.append(lcp.charAt(j));
				else
					break;					
			}
			lcp=sb.toString();
		}
		return lcp;
	}
}
