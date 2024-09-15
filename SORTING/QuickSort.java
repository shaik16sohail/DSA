package SORTING;

public class QuickSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int  partition(int []arr,int start,int end){
        // int i=start-1;
        // for(int j=start;j<end;j++){
        //     if(arr[end]>=arr[j]){
        //         i++;
        //         swap(arr,i,j);
        //     }
        // }
        // i++;
        // swap(arr,i,end);
        // return i;
        int pivot=arr[start];
        int i=start+1,j=end;
        while(i<j){
            while(i<j && arr[i]<=pivot)
                i++;
            while(i<j && arr[j]>pivot)
                j--;
            if(i<j)
                swap(arr,i,j);
        }
        if(arr[i]<=pivot){
            swap(arr,i,start);
            return i;
        }
        swap(arr,start,i-1);
        return i-1;

    }
    static void sort(int []arr,int start,int end){
        if(start<end){
            int mid=partition(arr,start,end);
            sort(arr,start,mid-1);
            sort(arr,mid+1,end);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7,4};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
