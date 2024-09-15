package ARRAYS;

public class Stocks {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int buyprice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            buyprice=Math.min(buyprice,prices[i]);
            profit=Math.max(profit,prices[i]-buyprice);
        }
        System.out.println(profit);
    }
}
