package RECURSE;

public class SubStrings {
    static int calculate(String str,int n){
        if(n==1)
            return str.length();
        int count=calculate(str,n-1);
        int i=0;
        while((i+n-1)<str.length()){
            String sub=str.substring(i, i+n);
            if(sub.charAt(0)==sub.charAt(sub.length()-1))
                count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="aba";
        System.out.println(calculate(str,str.length()));
    }
}
