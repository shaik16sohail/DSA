package HEAPS;

import java.util.ArrayList;

public class minHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        int parent(int i){
            return (i-1)/2;
        }
        void swap(int i,int j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }
        public void add(int data){
            arr.add(data);
            int i=arr.size()-1;
            while(i>0 && arr.get(parent(i))> arr.get(i)){
                swap(i,parent(i));
                i=parent(i);
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public void heapify(int ind){
            int left=2*ind+1;
            int right=2*ind+2;
            int min=ind;
            if(left<arr.size() && arr.get(left)<arr.get(min))
                min=left;
            if(right<arr.size() && arr.get(right)<arr.get(min))
                min=right;
            if(ind!=min){
                swap(min,ind);
                heapify(min);
            }
        }
        public int remove(){
            int data=arr.get(0);
            swap(0,arr.size()-1);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap hp=new Heap();
        hp.add(5);
        hp.add(2345);
        hp.add(35);
        hp.add(4);
        hp.add(3);
        hp.add(2);
        hp.add(69);
        while(!hp.isEmpty()){
            System.out.println(hp.remove());
        }
    }
}
