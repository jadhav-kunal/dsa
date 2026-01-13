class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> set = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(set.containsKey(nums[i]) && i - set.get(nums[i]) <= k){
                return true;
            }
            set.put(nums[i], i);
        }

        return false;
    }
}