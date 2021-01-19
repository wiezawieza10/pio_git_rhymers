package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    public static final int INT_VALUE = 0;
    private int totalRejected = INT_VALUE;

    public final int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//zle sformatowane wiersze: 5, 12, 14, 15

//Klawisze alt + ← oraz alt + → przełączają między otwartymi dokumentami w Intellij