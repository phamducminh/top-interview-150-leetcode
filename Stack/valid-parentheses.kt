class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (c in s) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c)
            } else {
                if (stack.isEmpty()
                    || (c == ')' && stack.peek() != '(')
                    || (c == '}' && stack.peek() != '{')
                    || (c == ']' && stack.peek() != '[')
                ) {
                    return false
                }
                
                stack.pop()
            }
        }

        return stack.isEmpty()
    }
}