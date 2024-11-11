package HEAPS;

public class HeapSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void maxHeapify(int arr[],int i,int heapsize){
        int left=2*i+1;
        int right=2*i+2;
        int max=i;
        if(left<heapsize && arr[max] <arr[left])
            max=left;
        if(right<heapsize && arr[max]<arr[right])
            max=right;
        if(max!=i){
            swap(arr,i,max);
            maxHeapify(arr,max,heapsize);
        }
    }
    static void MaxHeap(int [] arr){
        int n=arr.length;
        for(int i=(n-1)/2;i>=0;i--){
            maxHeapify(arr,i,n);
        }
    }
    static void Heapsort(int arr[]){
        MaxHeap(arr);
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            swap(arr,0,i);
            n--;
            maxHeapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,69,34,23,42,65,90,4};
        Heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
