package RECURSE;

public class sudoko {
    static boolean isSafe(int board[][],int row,int col,int digit){
        for(int i=0;i<9;i++){
            if(board[row][i]==digit)
                return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==digit)
                return false;
        }
        int grid_row=row/3*3;
        int grid_col=col/3*3;
        for(int i=grid_row;i<grid_row+3;i++){
            for(int j=grid_col;j<grid_col+3;j++){
                if(board[i][j]==digit)
                    return false;
            }
        }
        return true;
    }
    static boolean solve(int [][] board,int row,int col){
        if(row==9)
            return true;
        int nextrow=row,nextcol=col+1;
        if(col==8){
            nextcol=0;
            nextrow=row+1;
        }
        if(board[row][col]!=0){
            return solve(board,nextrow,nextcol);
        }
        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                if(solve(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //matrix
        int [][]board={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},
{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};
        if(solve(board,0,0)){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
