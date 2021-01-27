package edu.kis.vh.nursery;


import edu.kis.vh.nursery.BridgeStructure.IntArrayStack;

public class DefaultCountingOutRhymer {
    private IntArrayStack stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public int getStackCapacity() {
        return stack.getStackCapacity();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}
