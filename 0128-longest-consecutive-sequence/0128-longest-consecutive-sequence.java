class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        int longest = 0;
        for(int i=0; i<nums.length; i++){
            numSet.add(nums[i]);
        }

        for(int num : numSet){
              if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int streak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;

    }
}