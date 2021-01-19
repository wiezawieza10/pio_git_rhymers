package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public final int INITIAL = -1;
    public final int LENGTH = 12;
    public final int RETURN = -1;


    private final int[] NUMBERS = new int[LENGTH];


    private int total = INITIAL;

    public int getTotal() {
        return total;
    }
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == LENGTH - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total--];
    }

}
