/*Given an array of size n, find the majority element. The majority element is the element that appears more than  n/2  times.

You may assume that the array is non-empty and the majority element always exist in the array.*/
public class MajorityElement {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,2,3,3,2,2,2,3,2,2};
		System.out.println("Majority Element--->"+ majorityElement(arr));

	}
	
	public static int majorityElement(int[] nums) {
        int current = 0;
        int count = 0;
        for (int x : nums) {
            if (count == 0){
                current = x; 
                count = 1;
            }
            else if (current == x) 
                count++;
            else 
                count--;
        }
        return current;
    }

}
