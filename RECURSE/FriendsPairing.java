package RECURSE;

public class FriendsPairing {
    static int Pairing(int n){
        if(n==1||n==2)
            return n;
        //Pairing(n-1) refers to choice of only one person
        //Pairing(n-2) refers to choice of making one pair remaining ways will be n-2
        //but that above pairs can be done in n-1 ways
        return Pairing(n-1)+(n-1)*Pairing(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(Pairing(n));
    }
}
