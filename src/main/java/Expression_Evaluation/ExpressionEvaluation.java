package Expression_Evaluation;

import java.util.Stack;
import java.util.Vector;
import java.util.Enumeration;
class Expression {
    Vector<String> v;
    public Expression(){
        v=new Vector<>();
    }
    public void add(String s){
        v.add(s);
    }
    public void add(char c){
        v.add(Character.toString(c));
    }
    public void add(int n){
        v.add(Integer.toString(n));
    }
    public int length(){
        return v.size();
    }
    public Enumeration elements(){
        return v.elements();
    }
    @Override
    public String toString() {
        Enumeration e=v.elements();
        String s="";
        while (e.hasMoreElements()){
            s=s+" "+e.nextElement();
        }
        return s;
    }
    public int solve(){
        int ans=0;
        Stack<Integer> stack=new Stack<>();
        Enumeration<String> e=v.elements();
        System.out.println("\nElement\t\tStack\n");
        while (e.hasMoreElements()){
            String s=e.nextElement();
            if(Character.isDigit(s.charAt(0)) ){
                stack.add(Integer.valueOf(s));
            }
            else {
                int a=0,b=0,c=0;
                b=stack.pop();
                a=stack.pop();
                char op=s.charAt(0);
                switch (op){
                    case '+':
                        c=a+b;
                        break;
                    case '-':
                        c=a-b;
                        break;
                    case '*':
                        c=a*b;
                        break;
                    case '/':
                        c=a/b;
                        break;
                }
                stack.add(c);
            }System.out.print("\n"+s+"\t\t\t");
            Enumeration e1=stack.elements();
            while (e1.hasMoreElements()){
                System.out.print(e1.nextElement()+"\t");
            }

        }
        ans=stack.pop();
        return ans;
    }
}
public class ExpressionEvaluation {
    static int precedence(char c){
        int p=0;
        if(c=='^')p=3;
        else if(c=='*'||c=='/')p=2;
        else if(c=='+'|c=='-')p=1;
        return p;
    }
    static  Expression postfix(String s1){//to create postfix expression
        Expression exp=new Expression();
        Stack<Character> stack=new Stack<>();
        int digit=0;
        boolean isDigit=false;
        System.out.println("input\tdigit\toperator\t\toutput");
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(Character.isDigit(c)){//10 numbers
                isDigit=true;
                digit=digit*10+Integer.valueOf(Character.toString(c));
            }
            else if(c==')'){
                if(isDigit) {
                    isDigit = false;
                    exp.add(digit);
                    digit = 0;
                }
                while (!stack.empty()&&stack.peek()!='('&&precedence(stack.peek())>=precedence(c)){
                    exp.add(stack.pop());
                }
                stack.pop();

            }
            else if(c=='('){
                stack.push(c);
            }
            else {// operators + - * /
                if(isDigit)exp.add(Integer.toString(digit));
                digit=0;
                while (!stack.empty()&&c!='('&&precedence(stack.peek())>=precedence(c)){
                    exp.add(stack.pop());
                }
                stack.push(c);
            }

            //debug code
            Enumeration stack_enum=stack.elements();
            Enumeration exp_enum=exp.elements();
            System.out.print("\n"+c+"\t"+digit+"\t");
            while (stack_enum.hasMoreElements()){
                System.out.print(stack_enum.nextElement());
            }
            System.out.print("\t\t");
            while (exp_enum.hasMoreElements()){
                System.out.print(exp_enum.nextElement());
            }

        }
        if(isDigit)exp.add(digit);
        while (!stack.empty()){
            exp.add(stack.pop());
        }
        return exp;
    }
    public static void main(String args[]){
        String s="10*20+((262+85)+(89-11))";
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Expression:"+s);
        System.out.println("\n----------------------------------------------------------");
        Expression exp=postfix(s);
        System.out.println("\n----------------------------------------------------------");
        System.out.println("\npostfix:"+exp);
        System.out.println("\n----------------------------------------------------------");
        System.out.println("\nans:"+exp.solve());
    }
}
