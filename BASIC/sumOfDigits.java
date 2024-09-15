package BASIC;

import java.util.Scanner;
import java.lang.*;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String num_str=Integer.toString(num);
        int sum=0;
        for(int i=0;i<num_str.length();i++){
            sum+=num_str.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
