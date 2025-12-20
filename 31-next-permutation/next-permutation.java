class Solution {
    public void reverse(int arr[], int  l , int r){
        while(l<r){
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    }
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
            reverse(arr,pivot+1 ,n);
            
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
        reverse(arr,pivot+1 ,n);
        
    }
}