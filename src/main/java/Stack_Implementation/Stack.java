package Stack_Implementation;

class Stack<T>{
    Object elements[];
    int top;
    public Stack(){
        int top=-1;
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


}