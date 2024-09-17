package STRINGS;
import java.util.*;
public class CapitalizeEveryFirst {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==0 || str.charAt(i-1)==' ')
                sb.append(Character.toUpperCase(str.charAt(i)));
            else
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
