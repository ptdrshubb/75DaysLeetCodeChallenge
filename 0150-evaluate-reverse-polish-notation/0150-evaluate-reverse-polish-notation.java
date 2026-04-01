class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                if (token.equals("+")) result = a + b;
                else if (token.equals("-")) result = a - b;
                else if (token.equals("*")) result = a * b;
                else result = a / b;

                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") ||
               s.equals("*") || s.equals("/");
    }
}