package RECURSE;

public class Power {
    static int power(int n,int k){
        if(n==1)
            return k;
        int some=power(n/2,k);
        some*=some;
        if(n%2!=0)
            return some*k;
        return some;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(power(n,5));
    }
}
