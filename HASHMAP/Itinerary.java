package HASHMAP;
import java.util.*;
public class Itinerary {
    static String getStart(HashMap<String,String> map){
        HashSet<String> store=new HashSet<>();
        for(String key:map.keySet()){
            store.add(map.get(key));
        }
        for(String key:map.keySet()){
            if(!store.contains(key))
                return key;
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("Chennai","Banglore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        //need to find the start 
        String start=getStart(map);
        System.out.print(start);
        while(map.containsKey(start)){
            start=map.get(start);
            System.out.print(" -> "+start);
            
        }
        System.out.println();
    }
}
