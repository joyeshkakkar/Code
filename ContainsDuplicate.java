import java.util.HashSet;
import java.util.Set;
/*Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums={1,2,4,5,6,98,8,5};
		System.out.println("Array contains duplicates--->"+containsDuplicate(nums));

	}
	
	public static boolean containsDuplicate(int[] nums) {
        if(nums.length==0)
            return false;
        Set<Integer> distinct=new HashSet<Integer>();
        for(int num: nums){
            if(!distinct.add(num))
                return true;
        }
        return false;
    }
}
