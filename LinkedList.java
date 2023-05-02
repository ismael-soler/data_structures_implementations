import java.util.*;

public class LinkedList {
    Node head;

    public Node getHead() {
        return head;
    }

    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int d) {
        Node newNode = new Node(d);
        Node pointer = head;

        if (pointer == null) {
            head = newNode;
            return;
        }

        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = newNode;
    }

    public void deleteNode(int d) {
        if (head.data == d) {
            head = head.next;
            return;
        }

        Node pointer = head;

        while (pointer.next != null) {
            if (pointer.next.data == d) {
                pointer.next = pointer.next.next;
                return;
            }
        }
    }

    public void printList() {
        Node pointer = head;
        if (head == null) {
            System.out.println("List Empty!");
        }

        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {
        Node l = head;
        Node r = l;

        while (l != null) {
            r = l;
            while (r.next != null) {
                if (l.data == r.next.data) {
                    r.next = r.next.next;
                    continue;
                } else {
                    r = r.next;
                }
            }
            l = l.next;
        }
    }

    public int valueAtReverseIndex(int n) {
        Node pointer = head;
        int len = length();

        if (n > len || n < 0) {
            System.out.println("Index out of bounds");;
            return -1;
        }

        for (int i = len - n - 1; i > 0; i--)
            pointer = pointer.next;
        return pointer.data;
    }

    public int length() {
        Node pointer = head;
        int len = 0;

        while (pointer != null) {
            pointer = pointer.next;
            len++;
        }
        return len;
    }

    public void partition(int n) {
        LinkedList smallerList = new LinkedList();
        LinkedList equalList = new LinkedList();
        LinkedList biggerList = new LinkedList();
        Node pointer = head;

        while (pointer != null) {
            if (pointer.data < n)
                smallerList.push(pointer.data);
            else if (pointer.data == n)
                equalList.push(pointer.data);
            else
                biggerList.push(pointer.data);
            pointer = pointer.next;
        }

        head = smallerList.getHead();
        pointer = head;
        while (pointer.next != null)
            pointer = pointer.next;
        pointer.next = equalList.getHead();
        while (pointer.next != null)
            pointer = pointer.next;
        pointer.next = biggerList.getHead();
    }

    public static LinkedList sumReversed(LinkedList linkedList1, LinkedList linkedList2){
        int[] arr1 = new int[linkedList1.length()];
        int[] arr2 = new int[linkedList2.length()];
        Node pointer1 = linkedList1.getHead();
        Node pointer2 = linkedList2.getHead();

        for (int i = 0; i < linkedList1.length(); i++) {
            arr1[i] = pointer1.data;
            arr2[i] = pointer2.data;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return null;
    }

}

class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        LinkedList myList2 = new LinkedList();

        myList.push(7);
        myList.push(1);
        myList.push(6);
        myList2.push(5);
        myList2.push(9);
        myList2.push(2);

        LinkedList.sumReversed(myList, myList2);
    }

}