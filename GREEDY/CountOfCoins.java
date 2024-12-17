package GREEDY;
import java.util.*;
import java.lang.*;
public class CountOfCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int [] coins={1,2,5,10,20,50,100,500,2000};
        int count=0;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            while(coins[i]<=value){
                value-=coins[i];
                count++;
                res.add(coins[i]);
            }
        }
        System.out.println("Min count "+ count);
        System.out.println("Order:");
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
