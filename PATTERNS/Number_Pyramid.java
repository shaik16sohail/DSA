package PATTERNS;
import java.util.*;
import java.lang.*;
public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<num-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                int some=i+1;
                System.out.print(some+" ");
            }
            System.out.println();
        }
    }
}
