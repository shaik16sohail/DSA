package QUEUES;
import java.util.*;
public class Interleave {
    static void interleave(Queue<Integer> q){
        int size=q.size();
        Queue<Integer> first=new LinkedList<>();
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the number:");
            int some=sc.nextInt();
            q.add(some);
        }
        interleave(q);
        System.out.println("Finally");
        for(int i=0;i<n;i++){
            System.out.print(q.remove());
        }
    }
}
