package Stack_Implementation;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        try {
            s.push(2);
            s.pop();
        } catch (StackOverflow stackOverflow) {
            stackOverflow.printStackTrace();
        } catch (StackUnderflow stackUnderflow) {
            stackUnderflow.printStackTrace();
        }
    }
}
