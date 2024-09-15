package SORTING;
import java.util.*;
public class StringsMergeSort {
    static ArrayList<String> store=new ArrayList<>();
    static void merge(String arr[],int start,int mid,int end){
        store.clear();
        int i=start,j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i].compareTo(arr[j])<=0){
                store.add(arr[i++]);
            }else
                store.add(arr[j++]);
        }
        while(i<=mid)
            store.add(arr[i++]);
        while(j<=end)
            store.add(arr[j++]);
        for(i=0;i<store.size();i++){
            arr[i+start]=store.get(i);
        }
    }
    static void sort(String [] arr,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        String arr []= {"banglore","hyderabad","amaravati","delhi","chennai","kolkata","noida","pune","mumbai","vizag","tirupati"};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
