package PATTERNS;
import java.util.*;
import java.lang.*;
public class inverted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines to print:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
