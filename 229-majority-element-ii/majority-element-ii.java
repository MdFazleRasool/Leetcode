class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer > map = new HashMap<>();
        int n = nums.length;
        for(int i= 0;i<n;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i], freq+1);
            }
            else map.put(nums[i],1);
        }

    
    ArrayList<Integer> al = new ArrayList<>();
    for(int x : map.keySet()){
        if(map.get(x) > n/3){
            al.add(x);
        }
    }
    return al;
    }
}