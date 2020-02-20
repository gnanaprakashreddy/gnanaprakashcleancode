package Interest_Calculator;

public class CompoundInterest extends InterestCalculator {

	public CompoundInterest() {

	}
	public CompoundInterest(Double principal,Double rateofI, Double time) {

		this.principal=principal;
		this.rateofI=rateofI;
		this.time=time;

	}
	public Double getCompoundInterest() {

		return (principal * Math.pow(1.0 + rateofI / 100.0, time) - principal);

	}

}
