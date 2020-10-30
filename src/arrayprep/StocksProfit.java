package arrayprep;

public class StocksProfit {

    private static void findBestDay(int [] prices)
    {
        int i=0;
        int len = prices.length;

        while(i<len-1)
        {
            while(i<len-1 && prices[i+1]<prices[i])
                i++;

            if(i==len-1)
                break;

            int buy = i+1;

            while(i<len-1 && prices[i]<prices[i+1])
                i++;

            int sell = i+1;

            System.out.println("Best Day to buy stock is on day "+ buy + " and sell on day "+ sell);
        }
    }

    public static void main(String[] args) {

        int [] a = {100, 180, 260, 310, 40, 535, 695};
        findBestDay(a);

    }

}
