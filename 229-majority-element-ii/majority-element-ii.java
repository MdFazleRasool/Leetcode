class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0 , ele1 = nums[0];
        int count2 = 0 , ele2 = ele1-1;
        int n = nums.length;
        for(int i = 0; i<n;i++){
            if(count1 == 0 && nums[i] != ele2){
                ele1 = nums[i] ;
                count1=1;
            }
            else if(count2 == 0 && nums[i] != ele1){
                ele2 = nums[i] ;
                count2=1;
            }
            else if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0 ;
        count2 = 0;
        for(int x : nums){
            if(x == ele1 ) count1++;
            else if(x == ele2 ) count2++ ;
        }
        List<Integer> al = new ArrayList<>();
        if(count1>n/3)
            al.add(ele1);
        if(count2>n/3)
            al.add(ele2);
        return al;
    }
}