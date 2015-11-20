import java.util.Scanner;
/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/
public class ClimbingStairs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input the total number of stairs--->");
		int numOfStairs=scanner.nextInt();
		scanner.close();
		System.out.println("Number of combinations-->"+climbStairs(numOfStairs));		
	}
	
	public static int climbStairs(int n) {
        if(n == 0 || n == 1){
           return 1;
       }
        /*Any staircase with n steps allowing paths with increments of 1 or 2 steps at a time will end up in one of two states before the last path is taken: either we've climbed (n-1) steps already and have one more step to take, or we've climbed (n-2) steps already and we have two more steps to take (if we took only one step here then we'd end up in an arrangement from the first state).*/
       
       int num1=1, num2=1, finalCount=1;
       for(int i= 2; i<= n; i++){
           finalCount = num1 + num2; //Fibonacci number is sum of previous two Fibonacci number
           num1 = num2;
           num2 = finalCount;
       }
       return finalCount; //Fibonacci number
   }

}
