package PATTERNS;
import java.util.*;
import java.lang.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int top,bottom,right,left;
        for(int i=0;i<2*num-1;i++){
            for(int j=0;j<2*num-1;j++){
                top=i;
                bottom=(2*num-2)-i;
                left=j;
                right=(2*num-2)-j;
                System.out.print(num-Math.min(Math.min(top,bottom),Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }
}
