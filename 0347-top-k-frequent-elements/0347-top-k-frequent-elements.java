class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k]; 
        HashMap<Integer, Integer> freq = new HashMap<>(); // item, freq (frequency map)
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1); // store the items along with their freq in map
        }   
       
        ArrayList<Integer>[] bucket = new ArrayList[n+1]; // index will be the frequency of item, list at index i will store the item itself with freq i
        
        for(int key : freq.keySet()){ // iterate over freq map
            int f = freq.get(key); // extract frequency
            if(bucket[f] == null) bucket[f] = new ArrayList<>(); // if not initialized yet => initalize it with new ArrayList
            bucket[f].add(key); // store the item in bucket[f] which has freq f
        }
        
        for(int i = n; i >= 0 && k > 0; i--) { // iterate from backward so that we will get the items with max freq .... decreasing
            if(bucket[i] != null) { // bucket contains valid freq at i
                for(int num : bucket[i]) { // iterate over the items stored at freq f
                    ans[k-1] = num; // add it to ans 
                    k--; // until ans contains k items
                    if(k == 0) break; // k items filled => exit the loop
                }
            }
        }
        return ans; 
    }
}