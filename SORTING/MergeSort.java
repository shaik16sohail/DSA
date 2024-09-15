package SORTING;
import java.util.*;
public class MergeSort {
    static ArrayList<Integer> store=new ArrayList<>();
    static void merge(int arr[],int start,int mid,int end){
        store.clear();
        int i=start;
        int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j])
                store.add(arr[i++]);
            else
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
    static void sort(int arr[],int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
