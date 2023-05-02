import java.util.*;

public class SetOfStacks {
    private int maxCapacity;
    public ArrayList<Stack> stacks = new ArrayList<Stack>();
    public ArrayList<Integer> capacities = new ArrayList<Integer>();

    SetOfStacks(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void push(int data) {

        if (getLastStack() == null || lastStackCapacity() >= maxCapacity) {
            Stack newStack = new Stack();
            capacities.add(0);
            stacks.add(newStack);
        }

        Stack lastStack = getLastStack();
        lastStack.push(data);
        capacities.set(capacities.indexOf(lastStackCapacity()), lastStackCapacity() + 1);
    }

    public Stack getLastStack() {
        if (stacks.size() == 0)
            return null;
        return (stacks.get(stacks.size() - 1));
    }

    private int lastStackCapacity() {
        return capacities.get(stacks.indexOf(getLastStack()));
    }

    public static void main(String[] args) {
        SetOfStacks newSet = new SetOfStacks(3);

        newSet.push(5);
        newSet.push(2);
        newSet.push(76);

        System.out.println(newSet.capacities.size());
        System.out.println(newSet.capacities);
        newSet.push(1);
        newSet.push(12);
        System.out.println(newSet.capacities.size());
        System.out.println(newSet.capacities);

        newSet.push(5);
        newSet.push(11234);
        newSet.push(8592);
        newSet.push(12);
        newSet.push(45);

        System.out.println(newSet.capacities.size());
        System.out.println(newSet.capacities);

        System.out.println(newSet.stacks.get(0).peek());
    }
}
