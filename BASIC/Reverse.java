package BASIC;
import java.util.*;
import java.lang.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        StringBuffer sb=new StringBuffer(Integer.toString(num)).reverse();
        num=Integer.parseInt(sb.toString());
        System.out.println(num);
    }
}