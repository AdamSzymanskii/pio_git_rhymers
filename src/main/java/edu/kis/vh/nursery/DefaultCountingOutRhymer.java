package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int CAPACITY = 12;
    private final int EMPTY_SIZE = -1;
    private final int EMPTY_ELEMENT = -1;

    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY_SIZE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_SIZE;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_ELEMENT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_SIZE;
        return numbers[total--];
    }

}
