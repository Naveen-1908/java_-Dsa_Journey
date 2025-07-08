class gridunique{
    public int gridunique(int m, int n) {
        // Initialize the Grid
        int grid[][] = new int[m][n];
        
        // Make First Row and First Column all 1s
        for(int i=0; i<n; i++) {
            grid[0][i] = 1;
        } 
        for(int i=0; i<m; i++) {
            grid[i][0] = 1;
        }

        // Fill the values for other boxes
        // As boxval = topboxval + leftboxval
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }

        // Return cell value at last row, last column
        return grid[m-1][n-1];
    }
}
