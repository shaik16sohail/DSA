package GREEDY;
import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=69;
        int pivot=-1;
        int l,r;
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                pivot=i-1;
                break;
            }
        }
        r=pivot;
        l=pivot+1;
        while(l!=r){
            if(list.get(l)+list.get(r)==target){
                System.out.println("true");
                return;
            }
            else if(list.get(l)+list.get(r)<target)
                l=(l+1)%list.size();
            else
                r--;
            if(r<0)
                r=list.size()-1;
        }
        System.out.println("false");

    }
}
