package arrayprep;

public class KTransactions {

    private static int findMaxProfit(int[] prices,int k) {
        int [][] profits = new int[k+1][prices.length];
        int maxProfitTillNow = Integer.MIN_VALUE;
        for(int i=1;i<profits.length;i++)
            for(int j=1;j<profits[0].length;j++)
            {
                maxProfitTillNow = Math.max(-prices[j-1]+profits[i-1][j-1],maxProfitTillNow);
                profits[i][j] = Math.max(profits[i][j-1],prices[j]+maxProfitTillNow);
            }
        return profits[k][prices.length-1];
    }



    public static void main(String[] args) {
        int [] a = {10,22,5,75,65,80};
        int [] b = {2, 30, 15, 10, 8, 25, 80};
        int k =2;
        int profit = findMaxProfit(b,2);
        System.out.println("Max profit by buying & selling stocks atmost twice is: "+profit);
     }


}
