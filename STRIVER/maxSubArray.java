public class maxSubArray {
        public static int maxProfit(int[] prices)  {
            int minPrice=Integer.MAX_VALUE;
            int MaxProfit=0;
            int CurrentProfit=0;
            for(int i=1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    CurrentProfit=prices[i]-prices[i-1];
                    MaxProfit+=CurrentProfit;
                    
                }   
            }return MaxProfit;
        }
    
        
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println("Result is: " + maxProfit(prices));
    }

}

