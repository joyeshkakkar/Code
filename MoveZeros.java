/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].*/
public class MoveZeros {
	
	public static void main(String[] args) {
		int[] a= new int[]{1,0,5,3,0,6,0,4,0};
		/*int[] b = new int[8];
		int[] c={1,0,8,9,7,0,5,4};*/		
		printArray(a);
		moveZeros(a);
		System.out.println("After Execution of moveZeros---->");
		printArray(a);
	}
	
	public static void printArray(int[] a){
		for(int val: a){
			System.out.print(val+ " ");
		}
		System.out.println("");
	}
	
	public static void moveZeros(int[] a){
		int zeroCount=0;
		for(int i=0; i < a.length; i++){
			if(a[i]==0)
				zeroCount++;
			else
				a[i-zeroCount]=a[i];
		}
		
		for(int i=0; i < zeroCount ; i++){
			a[a.length-zeroCount+i]=0;
		}
	}

}
