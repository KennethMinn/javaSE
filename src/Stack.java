public class Stack {
    int[] stack;
    private int top = 0;

    public Stack(int size){
        stack = new int[size];
    }

    public  void push (int number) {
           stack[top] = number;
           top++;
    }

    public int pop (){
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek (){
        int data = stack[top - 1];
        return data;
    }

    public void show () {
        for( int n : stack) {
            System.out.println(n);
        }
    }
}
