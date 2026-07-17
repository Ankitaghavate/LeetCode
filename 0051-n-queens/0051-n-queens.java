class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        List<List<String>> ans=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }

        helper(board,ans,0);

        return ans;
    }

    public void helper(char board[][],List<List<String>> ans,int row)
    {
        int n=board.length;
        if(row==board.length)
        {
            ans.add(buildSol(board));
            return;
        }

        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board,i,row))
            {
                board[row][i]='Q';
                helper(board,ans,row+1);
                board[row][i]='.';
            }
        }
    }

    public boolean isSafe(char board[][],int col,int row)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }

    public List<String> buildSol(char board[][])
    {
        List<String> res=new ArrayList<>();

        for(int i=0;i<board.length;i++)
        {
            res.add(new String(board[i]));
        }
        return res;
    }
}