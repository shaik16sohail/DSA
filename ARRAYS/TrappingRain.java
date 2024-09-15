package ARRAYS;

public class TrappingRain {
    public static void main(String[] args) {
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int leftmax[]=new int [height.length];
        int rightmax[]=new int [height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i!=-1;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            int some=Math.min(leftmax[i],rightmax[i])-height[i];
            if(some>0)
                sum+=some;            
        }
        System.out.println(sum);
    }
}
