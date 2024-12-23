package HASHMAP;
import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{//generic-paramatized types
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N-> hashmap here or array of linked list
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key)
                    return di;
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){//O(N)
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];
            N*=2;
            for(int i=0;i<N;i++){
                buckets[i]=new LinkedList<>();

            }
            // nodes -> add in bucket
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node>ll=oldBucket[i];
                for(Node node:ll){
                    // Node node=ll.remove();
                    put(node.key,node.value);
                }
            }

        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }
        public void put(K key,V value){ //O(lambda) -> O(1)
            int bi =hashFunction(key); //0 to 3
            int di=SearchInLL(key,bi);
            if(di!=-1){
                Node node=buckets[bi].get(di);
                node.value=value;

            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda=n/(double)N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            return SearchInLL(key, bi)!=-1?true:false;
        }
        public V get(K key){
            int bi =hashFunction(key);
            int di= SearchInLL(key, bi);
            if(di!=-1)
                return buckets[bi].get(di).value;
            return null;
        }
        public V remove(K key){
            int bi =hashFunction(key);
            int di= SearchInLL(key, bi);
            if(di!=-1){
                n--;
                return buckets[bi].remove(di).value;
            }
            return null;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<N;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",130);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);
       
        hm.put("Pakisthan",70);
        hm.put("russia",20);
        hm.put("uk",8);
        hm.put("japan",15);
        hm.put("france",5);
        hm.put("australia",2);
        ArrayList<String>keys=hm.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i));
        }
    }
}
