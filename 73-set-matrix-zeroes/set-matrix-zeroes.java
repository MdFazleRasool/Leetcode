class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length   ;
        int copy[][] = new int [m][n]; 
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                copy[i][j] = matrix[i][j] ;
            }
        }
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    for(int a = 0; a<n;a++) copy[i][a] = 0;
                    for(int a = 0; a<m;a++) copy[a][j] = 0;
                }
            }
        }
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = copy[i][j] ;
            }
        }
        
    }
}