package Stack_Implementation;

import java.util.Enumeration;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        try {
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(12);
            s.push(9);
            Enumeration e=s.elements();
            System.out.println("Elements in stack:");
            while (e.hasMoreElements()){
                System.out.print("\t"+e.nextElement());
            }
            System.out.println("\nposition of 4 in stack:"+s.search(4));
            e=s.elements();
            System.out.println("\nthe peek/top most element in stack is: "+s.peek());
            System.out.println("\nElements in stack:");
            while (e.hasMoreElements()){
                System.out.print("\t"+e.nextElement());
            }
            System.out.println("\ntop most element"+s.pop()+"is popped");
            e=s.elements();
            System.out.println("\nElements in stack:");
            while (e.hasMoreElements()){
                System.out.print("\t"+e.nextElement());
            }
        } catch (StackOverflow stackOverflow) {
            stackOverflow.printStackTrace();
        } catch (StackUnderflow stackUnderflow) {
            stackUnderflow.printStackTrace();
        }
    }
}
