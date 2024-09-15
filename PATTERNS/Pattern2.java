package PATTERNS;
import java.util.*;
import java.lang.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int some=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
                some=j+1;
            }
            for(int k=0;k<(num-1-i)*2;k++){
                System.out.print("  ");
            }
            for(int l=0;l<=i;l++){
                System.out.print(some+" ");
                some--;
            }
            System.out.println();
        }
    }
}
