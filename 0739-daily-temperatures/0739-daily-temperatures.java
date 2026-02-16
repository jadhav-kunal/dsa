class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indices = new Stack<>();

        int[] ans = new int[temperatures.length];

        for(int i = temperatures.length - 1; i>=0; i--){

            while(!indices.isEmpty() && temperatures[i]>= temperatures[indices.peek()]){
                indices.pop();
            }

            if(!indices.isEmpty()){
                ans[i] = indices.peek() - i;
            }
            indices.push(i);
        }  

        return ans;  
    }
}