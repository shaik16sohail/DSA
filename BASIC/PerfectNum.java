package BASIC;
import java.util.Scanner;
import java.lang.*;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int a=sc.nextInt();
        System.out.println("Enter the ending number:");
        int b=sc.nextInt();
        while(a<=b){
            int num=a;
            int sum=0;
            for(int i=1;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    if(i==1)
                        sum+=i;
                    else if(i==num/i)
                        sum+=i;
                    else 
                        sum+=(i+num/i);
                }
            }
            if(a==sum)
                System.out.print(a+" ");
            a++;
        }
        System.out.println();
    }
}
