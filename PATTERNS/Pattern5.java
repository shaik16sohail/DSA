package PATTERNS;
import java.util.*;
import java.lang.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int some=0;
            if(i%2!=0)
                some=1;
            for(int j=0;j<=i;j++){
                some=(some==0)?1:0;
                System.out.print(some+" ");
            }
            System.out.println();
        }
    }
}
