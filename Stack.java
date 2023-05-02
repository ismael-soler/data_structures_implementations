import java.util.EmptyStackException;

public class Stack {
    private Node top;

    public int pop() {
        Node aux = top;

        if (top != null) {
            top = top.next;
            return aux.data;
        }
        throw new EmptyStackException();
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int peek(){
        return top.data;
    }
}

class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(2);
        myStack.push(5);
        myStack.push(4);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
    }
}
