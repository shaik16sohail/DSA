package PATTERNS;
import java.util.*;
import java.lang.*;
public class Pyramid_Abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            char ch='A';
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=(i*2);k++){
                if(k<=i){
                    System.out.print(ch);
                    ch++;
                    if(k==i)
                        ch--;
                }else{
                    ch--;
                    System.out.print(ch);
                }
            }
            System.out.println();
            
        }
    }
}
