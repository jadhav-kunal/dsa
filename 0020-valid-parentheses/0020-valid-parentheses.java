class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!parentheses.isEmpty() &&
                ((parentheses.peek() == '{' && current == '}') ||
                 (parentheses.peek() == '(' && current == ')') ||
                 (parentheses.peek() == '[' && current == ']'))) {

                parentheses.pop();
            } else {
                parentheses.push(current);
            }
        }

        return parentheses.isEmpty();
    }
}