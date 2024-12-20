package HASHMAP;
import java.util.*;
public class Iteration2 {
    public static void main(String[] args) {
        HashSet<String> some=new HashSet<>();
        some.add("mumbai");
        some.add("goa");
        some.add("delhi");
        some.add("hyd");
        for(String s:some){
            System.out.println(s);
        }
        System.out.println();
        Iterator it=some.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
