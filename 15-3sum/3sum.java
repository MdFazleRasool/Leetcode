class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0 ;i<n;i++){
            // skip duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int l = i+1 , r = n-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r] < 0){
                    l++;
                }
                else if (arr[i]+arr[l]+arr[r] > 0) {
                    r--;
                }
                else {
                    al.add(new ArrayList<>(Arrays.asList(arr[i],arr[l],arr[r])));
                    l++;
                    r--;
                    while (l < r && arr[l] == arr[l - 1]) l++;

                    // skip duplicate r
                    while (l < r && arr[r] == arr[r + 1]) r--;
                }
            }
        }
        return al ;
    }
}