package PATTERNS;
import java.util.*;
import java.lang.*;
public class Steady_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char ch='A';
        for(int i=0;i<num;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print(ch +" ");
                ch++;
               
            }
            System.out.println();
        }
    }
}
