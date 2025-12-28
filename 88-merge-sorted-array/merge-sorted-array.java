class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1 , j = n-1;
        int ele = m+n-1 ; 

        while(ele >= 0 && i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[ele--] = nums1[i--];
            }else{
                nums1[ele--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[ele--] = nums2[j--];
        }
        
    }
}