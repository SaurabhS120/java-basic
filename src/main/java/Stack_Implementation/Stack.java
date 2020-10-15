package Stack_Implementation;

import java.util.Enumeration;

class Stack<T>{
    Object elements[];
    int top;
    public Stack(){
        top=-1;
        elements=new Object[20];
    }
    public void push(T x)throws StackOverflow{
        if(top>=19){
            throw new StackOverflow();
        }else {
            top++;
            elements[top]=x;
        }
    }
    public T pop()throws StackUnderflow{
        if(top<=0){
            throw new StackUnderflow();
        }
        else {
            Object ele=elements[top];
            top--;
            return (T)ele;
        }
    }
    public boolean isEmpty(){
        return top<0;
    }
    public T peek(){
        return (T)elements[top];
    }
    public int search(T key){
        for (int i=0;i<elements.length;i++){
            if(elements[i]==key)return i;
        }
        return -1;
    }
    public Enumeration elements(){
        Enumeration<T> e=new Enumeration<T>() {
            Object e[]=elements;
            int t=top;
            int i=-1;
            @Override
            public boolean hasMoreElements() {
                return i<t;
            }

            @Override
            public T nextElement() {
                i++;
                return (T)e[i];
            }
        };
        return e;
    }

}