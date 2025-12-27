class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]) ;

        int start = intervals[0][0];
        int end = intervals[0][1] ;

        List<int[]> al = new ArrayList<>();
        for(int i = 1 ; i<intervals.length;i++){
            if(intervals[i][0] <= end){
                end= Math.max(end, intervals[i][1]);
            }
            else {
                al.add(new int[]{start,end});
                start= intervals[i][0] ;
                end = intervals[i][1] ;
            }
        }
        al.add(new int[]{start,end});
        return al.toArray(new int[al.size()][]);
    }
}