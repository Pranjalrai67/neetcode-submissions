class Solution {
    class Pair{
        int row;
        int col;

        Pair(int i,int j ){
            this.row = i;
            this.col = j;
        }
    }
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n  = grid[0].length;
        //LRUD
        int[] dr ={0,0,-1,1};
        int[] dc = {-1,1,0,0}; 
        boolean[][] visited = new boolean[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    ans = bfs(grid,visited,m,n,i,j,dr,dc);
                    return ans;
                }
            }
        }
        return ans;
    }
    private int  bfs(int[][] grid,boolean[][] visited ,int m,int n,int i,int j,int[] dr,int[] dc){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        visited[i][j] = true;
        int ans = 0;

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;

            for(int k = 0; k < 4;k++){
                int nr = row + dr[k];
                int nc = col + dc[k];
                if(nr < 0 || nr >= m || nc < 0 || nc >= n || grid[nr][nc] ==0){
                    ans++;
                }else if(!visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new Pair(nr,nc));
                }
                // if(nr  < m && nr >= 0 && nc >=0 && nc < n && grid[nr][nc] == 1 && !visited[nr][nc]){
                //     visited[nr][nc] = true;
                //     q.add(new Pair(nr,nc));
                // }else{
                //     ans++;
                // }

            }
        }
        return ans;
    }
}