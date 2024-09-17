package SORTING;

public class ShellSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int arr[]){
        int n=arr.length;
        n=(int) Math.ceil(n/2.0);
        while(n>0){
            for(int i=0;i<arr.length-n;i++){
                if(arr[i]>arr[i+n])
                    swap(arr,i,i+n);
            }
            if(n==1)
                break;
            n=(int)Math.ceil(n/2.0);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,2,4,3,7,4};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
