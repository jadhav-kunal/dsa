class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            // nums = [2,7,11,15], target = 9
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}