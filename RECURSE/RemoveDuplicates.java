package RECURSE;
import java.util.*;
public class RemoveDuplicates {
    static String Remove(StringBuilder sb,String str,int ind,HashSet<Character>map){
        if(ind==str.length())
            return sb.toString();
        if(!map.contains(str.charAt(ind))){
            sb.append(str.charAt(ind));
            map.add(str.charAt(ind));
        }
        return Remove(sb,str,ind+1,map); 
    }
    public static void main(String args[]){
        String str="sohail";
        System.out.println(Remove(new StringBuilder(), str, 0, new HashSet<>()));
    }
}
