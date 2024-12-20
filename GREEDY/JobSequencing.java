package GREEDY;
import java.util.*;
import java.lang.*;
public class JobSequencing {
    static class Job{
        int id,deadline,profit;
        public Job(int i,int d,int pro){
            this.id=i;
            this.deadline=d;
            this.profit=pro;
        }
    }
    public static void main(String[] args) {
        int array[][]={{4,30},{1,20},{2,5}};
        ArrayList<Job>jobs=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            jobs.add(new Job(i,array[i][0],array[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        int time=0,total=0;
        ArrayList <Integer> res=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(jobs.get(i).deadline>time){
                time++;
                res.add(jobs.get(i).id);
                total+=jobs.get(i).profit;
            }
        }
        System.out.println("profit"+total);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
