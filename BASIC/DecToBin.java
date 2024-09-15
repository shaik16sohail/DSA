package BASIC;
import java.util.*;
import java.lang.*;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long bin=0,pow=1;
        while(num>0){
            bin+=(num%2)*pow;
            pow*=10;
            num/=2;
        }
        System.out.println(bin);
    }
}
