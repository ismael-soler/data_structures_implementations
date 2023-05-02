
public class ArrayedStack {
    int stackSize = 100;
    int[] buffer = new int[stackSize * 3];
    int[] stackPointer = {-1, -1, -1};

    public void push(int stackNum, int data) throws Exception {
        // Check if we have space
        if (stackPointer[stackNum] + 1 >= stackSize)
            throw new Exception("Stack is full");

        // Move the pointer to the next position and add data
        stackPointer[stackNum]++;
        buffer[absTopPosition(stackNum)] = data;
    }

    public int pop(int stackNum) throws Exception {
        // Check if Stack has any data
        if (stackPointer[stackNum] < 0)
            throw new Exception("Stack is empty");

        int value = buffer[absTopPosition(stackNum)];
        buffer[absTopPosition(stackNum)] = 0;
        stackPointer[stackNum]--;
        return value;
    }

    public int peek(int stackNum){
        return buffer[absTopPosition(stackNum)];
    }

    public boolean isEmpty(int stackNum){
        return stackPointer[stackNum] == -1;
    }

    private int absTopPosition (int stackNum){
        return  stackNum * stackSize + stackPointer[stackNum];
    }
}

class Main {
    public static void main(String[] args) throws Exception{
        ArrayedStack myStacks = new ArrayedStack();

        myStacks.push(0, 4);
        myStacks.push(1, 5);
        myStacks.push(1, 8);
        myStacks.push(0, 1235);
        myStacks.push(1, 3);
        System.out.println(myStacks.pop(0));
        System.out.println(myStacks.pop(1));
        System.out.println(myStacks.pop(1));
        System.out.println(myStacks.pop(0));
    }
}
