package RECURSE;

public class TowerofHanoi {
    static void tower(int n,String src,String help,String dest){
        if(n==1){
            System.out.println(n +" shifts from "+ src + "to"+dest);
            return ;
        }
        tower(n-1,src,dest,help);
        System.out.println(n +" shifts from "+ src + "to"+dest);
        tower(n-1,help,src,dest);

    }
    public static void main(String[] args) {
        int n=4;
        tower(n,"A","B","C");
    }
}
