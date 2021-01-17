package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

	public int reportRejected() {
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