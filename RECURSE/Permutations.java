
package RECURSE;
public class Permutations {
    static void permutate(String str,String res){
        if(str.length()==0){
            System.out.print(res+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String some=str.substring(0, i)+str.substring(i+1);
            permutate(some, res+ch);
        }
    }
    public static void main(String[] args) {
        String a="abc";
        permutate(a,"");
        System.out.println();
    }
}
