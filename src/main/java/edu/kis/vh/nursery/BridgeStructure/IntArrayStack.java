package edu.kis.vh.nursery.BridgeStructure;

public class IntArrayStack implements StackAndListInterface {
    public static final int INITIAL = -1;
    public static final int LENGTH = 12;
    public static final int RETURN = -1;


    private final int[] NUMBERS = new int[LENGTH];


    public int total = INITIAL;

    public void push(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isEmpty() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == LENGTH - 1;
    }

    protected int peekaboo() {
        if (isEmpty())
            return RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (isEmpty())
            return RETURN;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

    public int getStackCapacity() {
        return LENGTH;
    }
}
