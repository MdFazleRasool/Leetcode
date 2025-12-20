class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length   ;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    al.add(i);
                    al.add(j);
                }
            }
        }
        for(int k = 0;k<al.size();k+=2){
            int i = al.get(k), j = al.get(k+1);
            for(int a = 0; a<n;a++) matrix[i][a] = 0;
            for(int a = 0; a<m;a++) matrix[a][j] = 0;
        }

        // for(int a = 0; a<n;a++) copy[i][a] = 0;
        // for(int a = 0; a<m;a++) copy[a][j] = 0;
    }
}