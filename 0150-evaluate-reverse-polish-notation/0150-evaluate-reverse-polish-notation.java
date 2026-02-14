class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for(int i = 0; i< tokens.length; i++){
            if(tokens[i].equals("+") || 
   tokens[i].equals("-") || 
   tokens[i].equals("*") || 
   tokens[i].equals("/"))
{
                int num2 = nums.pop();
                int num1 = nums.pop();
                int res =0;
                if(tokens[i].equals("+") ){
                    res = num1 + num2;
                } else if(tokens[i].equals("-") ){
                    res = num1 - num2;
                } else if(tokens[i].equals("*") ){
                    res = num1 * num2;
                } else if(tokens[i].equals("/") ){
                    res = num1 / num2;
                } 
                nums.push(res);
            } else {
             nums.push(Integer.parseInt(tokens[i]));
            }
        }

        return nums.pop();
    }
}