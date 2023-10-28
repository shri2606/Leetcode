class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char x : s.toCharArray()) {
            if (bracketMap.containsKey(x)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMap.get(x)) {
                    return false;
                }
            } else {
                stack.push(x);
            }
        }
        return stack.isEmpty();
    }
}