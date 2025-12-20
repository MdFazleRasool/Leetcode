class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length -1 , pivot=-1;
        if(arr.length==1) return;
        for(int i = n-1;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            int l = pivot+1 , r = n;
            while(l<r){
                int temp = arr[l];
                arr[l]= arr[r];
                arr[r]= temp;
                l++;
                r--;
            }
            return;
        }
        
        
        int sidx = n;
        while (arr[sidx] <= arr[pivot]) {
            sidx--;
        }
        
        int temp = arr[sidx];
        arr[sidx]= arr[pivot];
        arr[pivot]= temp;

        
        // rotating 
        
        int l = pivot+1 ;
        int r = n;
        while(l<r){
            temp = arr[l];
            arr[l]= arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    }
}