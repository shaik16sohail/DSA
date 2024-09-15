package RECURSE;

public class KnightsTour {
    static boolean isSafe(int board[][],int i,int j){
        if(i>=0 && i<board.length && j>=0 && j<board.length && board[i][j]==-1)
            return true;
        return false;

    }
    static boolean find(int x,int y,int n,int board[][],int xMove[],int yMove[]){
        if(n==board.length*board.length){
            return true;
        }
        int next_x,next_y;
        for(int i=0;i<board.length;i++){
            next_x=x+xMove[i];
            next_y=y+yMove[i];
            if(isSafe(board,next_x,next_y)){
                board[next_x][next_y]=n;
                if(find(next_x,next_y,n+1,board,xMove,yMove))
                    return true;
                board[next_x][next_y]=-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=8;
        int [][] board=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=-1;
            }
        }
        board[0][0]=0;
        int xMove[]={2,1,-1,-2,-2,-1,1,2};
        int yMove[]={1,2,2,1,-1,-2,-2,-1};
        
        if(find(0,0,1,board,xMove,yMove)){
            System.out.println("Solution is");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+"  ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No solution");
        }
    }
}
