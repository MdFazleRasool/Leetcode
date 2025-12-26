class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length ; 
        List<List<Integer>> al = new ArrayList<>() ;
        
        Arrays.sort(arr) ; 
        for(int i = 0 ; i<n-3;i++){
            if( i> 0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1 ; j < n - 2 ; j++) {
                if( j> i+1 && arr[j] == arr[j-1]) continue;
                int l = j+1, r = n-1;
                while(l < r ) {
                    long sum =(long) arr[i] + arr[j] + arr[l] + arr[r] ;
                    if(sum < target) l++ ;
                    else if( sum > target) r-- ;
                    else {
                        al.add(new ArrayList<>(Arrays.asList(arr[i] , arr[j] , arr[l] , arr[r]))) ;
                        while(l<r && arr[l] == arr[l+1]) l++ ;
                        while(l<r && arr[r] == arr[r-1]) r-- ;
                        
                        l++;
                        r--;
                        
                        
                    }
                }
            }
        }
        return al;
    }
}