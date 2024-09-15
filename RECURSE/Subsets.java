package RECURSE;

public class Subsets {
    static void printAll(String org,String res,int ind){
        if(ind==org.length()){
            System.out.println(res);
            return;
        }
        
        printAll(org, res+org.charAt(ind), ind+1);
        printAll(org, res, ind+1);
        
    }
    public static void main(String[] args) {
        String s="abc";
        printAll(s,"",0);
    }
}
