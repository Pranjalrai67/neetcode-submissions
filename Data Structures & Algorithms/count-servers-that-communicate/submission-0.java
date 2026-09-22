class Solution {
    public int countServers(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[] arrRow  = new int[m];
        int[] arrCol = new int[n];
        int ans = 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    arrRow[i]++;
                    arrCol[j]++;
                }
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    if(arrRow[i] > 1 || arrCol[j] > 1){
                        ans++;
                    }
                }
            }
        }
        return ans;
    
    
    }
}