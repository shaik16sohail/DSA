package PATTERNS;
import java.util.*;
import java.lang.*;
public class Inverted_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            // for(int j=0;j<i;j++){
            //     System.out.print("  ");
            // }
            // for(int k=1;k<(num*2-2*i);k++){
            //     System.out.print("* ");
            // }
            
            // System.out.println();
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<(num*2-2*i);k++){
                if(i==0 || i==num-1 || k==1 ||k==(num*2-2*i)-1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
