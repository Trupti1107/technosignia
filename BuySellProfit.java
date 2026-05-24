package DSA;

public class BuySellProfit {
	
	    public static int maxProfit(int[] prices) {

	        // Stores total profit
	        int profit = 0;

	        // Traverse prices array
	        for (int i = 1; i < prices.length; i++) {

	            /*
	             * If today's price is greater
	             * than yesterday's price,
	             * profit can be made
	             */

	            if (prices[i] > prices[i - 1]) {

	                // Add current profit
	                profit += prices[i] - prices[i - 1];
	            }
	        }

	        return profit;
	    }

		public static int maxProfitx(int[] a) {
			int profit = 0;

			for (int i = 1; i < a.length; i++) {
				if (a[i] > a[i - 1]) {

					profit += a[i] - a[i - 1];

				}

			}

			return profit;

		}

	    public static void main(String[] args) {
			 int [] stock = {7,1,3,4,5,6};
			 
			 System.out.println(maxProfit(stock));
		}
}
