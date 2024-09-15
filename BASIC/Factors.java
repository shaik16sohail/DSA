package BASIC;
import java.util.Scanner;
import java.lang.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i)
                    System.out.print(i+" ");
                else
                    System.out.print(num/i+" "+i+" ");
            }
                
        }
    }
}
