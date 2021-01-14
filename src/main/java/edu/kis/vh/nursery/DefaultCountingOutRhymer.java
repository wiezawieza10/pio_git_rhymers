package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTAL_VALUE = -1;
    private static final int TABSIZE = 12;
    private int[] NUMBERS = new int[TABSIZE];

    public int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == TABSIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_VALUE;
        return NUMBERS[total--];
    }

}
