class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visit=new boolean [m][n];
        int r=0;
        int c=0;
        visit[r][c]=true;
        while(true)
        {
            char dir=grid[r][c];
            int nr=0,nc=0;
            if(dir=='L')
            {
                nc--;
            }
            else
            if(dir=='R')
            {
                nc++;
            }
            else
            if(dir=='U')
            {
                nr--;
            }
            else
            if(dir=='D')
            {
                nr++;
            }
            if((c+nc<n && c+nc>=0)&&(r+nr<m && r+nr>=0)&&!visit[r+nr][c+nc]){
                c=c+nc;
                r=r+nr;
                visit[r][c]=true;
            }
            else
            {
                break;
            }
        }
        return new int[]{r,c};
    }
}