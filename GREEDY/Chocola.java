package GREEDY;
import java.util.*;
import java.lang.*;
public class Chocola {
    public static void main(String[] args) {
        Integer []vertical={4,1,2};
        Integer []horizon={2,1,3,1,4};
        Arrays.sort(vertical,Comparator.reverseOrder());
        Arrays.sort(horizon,Comparator.reverseOrder());
        int hp=1,vp=1;
        int h=0,v=0;
        int total_cost=0;
        while(h<horizon.length && v<vertical.length){
            if(horizon[h]<=vertical[v]){
                total_cost+=(hp*vertical[v]);
                vp++;
                v++;
            }else{
                total_cost+=(vp*horizon[h]);
                hp++;
                h++;
            }
        }
        while(h<horizon.length){
            total_cost+=(vp*horizon[h]);
            hp++;
            h++;
        }
        while(v<vertical.length){
            total_cost+=(hp*vertical[v]);
            vp++;
            v++;
        }
        System.out.println(total_cost);
    }
}
