package BASIC;
import java.util.Scanner;
import java.lang.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int a=sc.nextInt();
        System.out.println("Enter the ending number:");
        int b=sc.nextInt();
        int num,sum,some;
        while(a<=b){
                num=a;
                int len=Integer.toString(num).length();
                sum=0;
                while(num!=0){
                    sum+=(int)Math.pow(num%10,len);
                    num/=10;
                }
                if(a==sum)
                    System.out.print(a+" ");
                a++;
        }

    }
}
