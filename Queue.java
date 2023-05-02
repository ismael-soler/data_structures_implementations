public class Queue {
    Node first, last;

    public void enqueue(int d) {
        Node newNode = new Node(d);

        if (first == null){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int dequeue(){
        int aux;

        if (first != null){
            aux = first.data;
            first = first.next;
            return aux;
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
