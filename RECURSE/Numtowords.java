package RECURSE;

public class Numtowords {
    static String give(int n){
        if(n==0)
            return " zero";
        else if(n==1)
            return " one";
        else if(n==2)
            return " two";
        else if(n==3)
            return " three";
        else if(n==4)
            return " four";
        else if(n==5)
            return " five";
        else if(n==6)
            return " six";
        else if(n==7)
            return " seven";
        else if(n==8)
            return " eight";
        return " nine";
    }
    static String Change(int n,String str){
        if(n==0){
            return str.trim();
        }
        String newString=give(n%10)+str;
        return Change(n/10,newString);
    }
    public static void main(String[] args) {
        int n=1947;
        System.out.println(Change(n,""));
    }
}
