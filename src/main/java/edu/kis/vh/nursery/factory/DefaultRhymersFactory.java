package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
<<<<<<< Updated upstream
	public defaultCountingOutRhymer GetStandardRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFalseRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFIFORhymer() {
=======
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
>>>>>>> Stashed changes
		return new FIFORhymer();
	}

	@Override
<<<<<<< Updated upstream
	public defaultCountingOutRhymer GetHanoiRhymer() {
=======
	public DefaultCountingOutRhymer getHanoiRhymer() {
>>>>>>> Stashed changes
		return new HanoiRhymer();
	}

}
