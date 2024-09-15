package PATTERNS;
import java.util.*;
import java.lang.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            // for(int j=0;j<num-i-1;j++){
            //     System.out.print(" ");
            // }
            // for(int k=0;k<=(i*2);k++){
            //     System.out.print("*");
            // }
            // System.out.println();
            for(int j=0;j<num-i-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=(i*2);k++){
                if(i==num-1||i==0||k==0||k==(i*2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
