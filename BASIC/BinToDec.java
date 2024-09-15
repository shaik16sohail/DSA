package BASIC;
import java.util.Scanner;
import java.lang.*;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=1,dec=0;
        while(num>0){
            dec+=(num%10)*pow;
            pow*=2;
            num/=10;
        }
        System.out.println(dec);
    }
}
