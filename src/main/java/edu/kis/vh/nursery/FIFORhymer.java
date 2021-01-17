package edu.kis.vh.nursery;

<<<<<<< Updated upstream
public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
=======
public class FIFORhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
>>>>>>> Stashed changes
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
