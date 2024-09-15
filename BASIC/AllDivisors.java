package BASIC;
import java.util.Scanner;
import java.lang.*;
public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.print(i+" ");
                if(i!=num/i)
                    System.out.print(num/i+" ");
            }
        }
        System.out.println();
    }
}
