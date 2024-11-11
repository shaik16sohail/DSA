package HEAPS;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pq {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pqueue=new PriorityQueue<>();
        pqueue.add(new Student("sohail", 23));
        pqueue.add(new Student("virat",18));
        pqueue.add(new Student("allah" ,1));
        while(!pqueue.isEmpty()){
            System.out.println(pqueue.peek().name +" "+ pqueue.peek().rank);
            pqueue.remove();
        }
    }
}
