import java.util.Scanner;
public class StockBuySell {

	public static void main(String[] args) {
		int[] stockPrices = {10,7,5,8,11,9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of array elements--->");
		int length = scanner.nextInt();
		for (int i = 0; i< length;i++){
			stockPrices[i]=scanner.nextInt();
		}
		scanner.close();
		System.out.print("Array--> ");
		for(int i: stockPrices){
			System.out.print(i+" ");
		}
		
		System.out.println("\nMax profit is--> " +getMaxProfit(stockPrices));
	}

	private static int getMaxProfit(int[] stockPrices){
		int maxNum= 0;
		int maxNumIndex=0;
		for(int i =0 ; i < stockPrices.length; i++){
			if(stockPrices[i]>=maxNum){
				maxNum=stockPrices[i];
				maxNumIndex=i;
			}
		}
		int profit = 0;
		for(int i =0; i < maxNumIndex; i++){
			if((maxNum - stockPrices[i]) > profit){
				profit = maxNum - stockPrices[i];
			}
		}
		return profit;
	}
}
