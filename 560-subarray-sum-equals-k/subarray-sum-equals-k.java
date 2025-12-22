class Solution {
    public int subarraySum(int[] arr, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i =1 ; i<arr.length;i++){
        arr[i] = arr[i-1]+arr[i] ;
       }
       int count = 0  ;
       for(int i = 0 ; i<arr.length ; i++){
        int ele = arr[i];
        if(ele == k) count+=1;
        int rem = ele-k ; 
        if(map.containsKey(rem)){
            count+=map.get(rem);
        }
        if(map.containsKey(ele)){
            
            int freq = map.get(ele);
            map.put(ele,freq+1) ; 
        }
        else {
             map.put(ele,1);
        }
       }
       return count ;
    }
}