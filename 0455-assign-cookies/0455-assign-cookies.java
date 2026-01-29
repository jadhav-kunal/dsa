class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int left = 0;
        int right = 0;
        int content = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while(left < g.length && right < s.length){
            if(g[left] <= s[right]){
                content++;
                left++;
                right++;
            } else if(g[left] > s[right]){
                right++;
            }
        }

        return content;
    }
}