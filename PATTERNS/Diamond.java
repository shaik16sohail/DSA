package PATTERNS;
import java.util.*;
import java.lang.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(num*2-2*i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
