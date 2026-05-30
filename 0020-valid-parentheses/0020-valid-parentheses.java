class Solution {
    public boolean isValid(String s) {
       
        // Map to keep track of bracket pairs
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If the character is a closing bracket
            if (map.containsKey(c)) {
                // Get the top element of the stack. If empty, use a dummy value '#'
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                
                // If the mapping doesn't match the popped element, it's invalid
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                // It's an opening bracket, push it onto the stack
                stack.push(c);
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
        
    