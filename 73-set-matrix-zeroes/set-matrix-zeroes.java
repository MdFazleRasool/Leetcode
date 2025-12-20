class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length   ;
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] =true;
                    col[j] = true;
                }
            }
        }
        for(int k = 0;k<m;k++){
            if(row[k] == true){
                for(int a = 0; a<n;a++) matrix[k][a] = 0;
            }
        }
        for(int k = 0;k<n;k++){
            if(col[k] == true){
                for(int a = 0; a<m;a++) matrix[a][k] = 0;
            }
        }

        // for(int a = 0; a<n;a++) copy[i][a] = 0;
        // for(int a = 0; a<m;a++) copy[a][j] = 0;
    }
}