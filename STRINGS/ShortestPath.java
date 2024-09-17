package STRINGS;
import java.util.*;
public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0,j=0;
        for(int k=0;k<str.length();k++){
            if(str.charAt(k)=='E')
                j++;
            else if(str.charAt(k)=='W')
                j--;
            else if(str.charAt(k)=='N')
                i++;
            else
                i--;

        }
        System.out.println(Math.sqrt((i*i)+(j*j)));
    }
}
