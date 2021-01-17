package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


	public static final int INITIAL = -1;
	public static final int CAPACITY = 12;
	public static final int RETURN = -1;


	private final int[] NUMBERS = new int[CAPACITY];


	public int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == INITIAL;
		}
		
			public boolean isFull() {
				return total == CAPACITY-1;
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
