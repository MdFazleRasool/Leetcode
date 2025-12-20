class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length   ;
        boolean row = false;
        boolean col = false;
        for(int i = 0 ;i<m;i++){
            if(matrix[i][0] == 0) col = true;
        }
        for(int i = 0 ;i<n;i++){
            if(matrix[0][i] == 0) row = true;
        }
        for(int i =1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] =0;
                    matrix[0][j] =0;
                }
            }
        }

        for(int i = 1 ;i<m;i++){
            if(matrix[i][0] == 0) {
                for(int a = 0; a<n;a++) matrix[i][a] = 0;
            }
        }
        for(int i = 1 ;i<n;i++){
            if(matrix[0][i] == 0) {
                for(int a = 0; a<m;a++) matrix[a][i] = 0;
            }
        }
        if(row)  for(int a = 0; a<n;a++) matrix[0][a] = 0; 
        
        if(col)  for(int a = 0; a<m;a++) matrix[a][0] = 0;
    }
}