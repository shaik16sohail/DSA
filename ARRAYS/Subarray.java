package ARRAYS;
import java.util.*;
import java.lang.*;
public class Subarray {
    static int kadanes(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i:arr){
            // curr_sum=Math.max(curr_sum,);
            curr_sum=(curr_sum+i<0)?0:curr_sum+i;
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
    static void brute(int arr[]){
        int max=-444;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                if(sum>max)
                    max=sum;
                System.out.println();
            }
        }
        System.out.println(max);
    }
    static int find(int arr[]){
        int max=-444;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max)
                    max=sum;
                // System.out.println();
            }
        }
        // System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int ano[]={-2,-3,4,-1,-2,1,5,-3};
        // brute(arr);
        System.out.println(find(arr));
        System.out.println(kadanes(ano));
    }
}
