package RECURSE;
import java.util.*;
public class Permutate2 {
    static void Permuate(String org,StringBuilder res,int start){
        System.out.println(res);
        for(int i=start;i<org.length();i++){
            res.append(org.charAt(i));
            Permuate(org, res, i+1);
            res.deleteCharAt(res.length()-1);
        }
    }
    public static void main(String[] args) {
        String str="1234";
        Permuate(str,new StringBuilder(),0);
    }
}
