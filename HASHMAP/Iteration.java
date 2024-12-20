package HASHMAP;
import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("Chennai","Banglore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for(String s:map.keySet()){
            System.out.println(map.get(s));
        }
    }
}
