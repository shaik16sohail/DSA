package BASIC;
import java.util.*;
import java.lang.*;
public class Prime {
    static boolean prime(int n){
        if(n<=1)
            return false;
        else if(n==2)
            return true;
        else if(n%2==0)
            return false;
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(prime(num)?"prime":"Not a prime");

    }
}
