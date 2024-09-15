package BASIC;
import java.util.Scanner;
import java.lang.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        while(num!=1){
            if(num%i==0){
                while(num%i==0){
                    System.out.print(i+" ");
                    num/=i;
                }
            }else
                i++;
        }
        System.out.println();

    
    }
}
