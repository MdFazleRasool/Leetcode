class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();
        int m = matrix.length , n = matrix[0].length ;
        int minc = 0 , maxc = n-1 ;
        int minr = 0 , maxr= m-1 ;
        
        while(minc <= maxc && minr <= maxr){
            // left to  Right   
            int j = minc;
            while(j<=maxc){
                al.add(matrix[minr][j]);
                j++;
            }
            minr++;

            // top to bottom
            if(minr> maxr || minc > maxc) break;
            j=minr;
            while(j<=maxr){
                al.add(matrix[j][maxc]);
                j++;
            }
            maxc--;

            // right to left 
            if(minr > maxr || minc > maxc) break;
            j=maxc;
            while(j>=minc){
                al.add(matrix[maxr][j]);
                j--;
            }
            maxr--;

            // bottom to top
            if(minr> maxr || minc > maxc) break;
            j = maxr;
            while(j>=minr){
                al.add(matrix[j][minc]);
                j-- ;
            }
            minc++;




        }
        return al;
    }
}