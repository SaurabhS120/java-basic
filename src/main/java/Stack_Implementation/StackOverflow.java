package Stack_Implementation;

class StackOverflow extends Exception{
    public StackOverflow(){
        super("Stack is full");
    }
}