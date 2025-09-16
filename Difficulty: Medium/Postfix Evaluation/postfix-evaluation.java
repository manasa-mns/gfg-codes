class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        for(String token:arr){
            if(isOperator(token)){
                int b=stack.pop();
                int a=stack.pop();
                int result=applyOperator(a,b,token);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static boolean isOperator(String s){
        return s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*")||s.equals("^");
    }
    public static int applyOperator(int a,int b,String operator){
        switch(operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
             case "*":
                return a*b;
             case "/":
                return Math.floorDiv(a,b);
             case "^":
                return (int)Math.pow(a,b);
            default:
                throw new IllegalArgumentException("Invalid Operator");
        }
    }
}