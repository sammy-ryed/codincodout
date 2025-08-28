import java.util.*;
public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        try {
            int result = evaluate(expr);
            System.out.println("Result: " + result);
        } catch(Exception e){
            System.out.println("Invalid Expression");
        }
        sc.close();
    }
    public static int evaluate(String expr){
        String[] tokens = expr.split(" ");
        Stack<Integer> values = new Stack<>();
        Stack<String> ops = new Stack<>();
        for(String t : tokens){
            if(t.matches("\\d+")) values.push(Integer.parseInt(t));
            else {
                while(!ops.isEmpty() && precedence(ops.peek())>=precedence(t)){
                    int b = values.pop(), a = values.pop();
                    String op = ops.pop();
                    values.push(apply(a,b,op));
                }
                ops.push(t);
            }
        }
        while(!ops.isEmpty()){
            int b = values.pop(), a = values.pop();
            String op = ops.pop();
            values.push(apply(a,b,op));
        }
        return values.pop();
    }
    public static int precedence(String op){
        if(op.equals("+")||op.equals("-")) return 1;
        if(op.equals("*")||op.equals("/")) return 2;
        return 0;
    }
    public static int apply(int a,int b,String op){
        switch(op){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
        }
        return 0;
    }
}