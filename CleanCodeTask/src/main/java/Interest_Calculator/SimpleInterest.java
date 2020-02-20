package Interest_Calculator;

public class SimpleInterest extends InterestCalculator {

	public void SimpleInterest() {

	}
	public SimpleInterest(Double principal ,Double rateofI, Double time) {

		this.principal=principal;
		this.rateofI = rateofI;
		this.time= time;

	}

	public Double getSimpleInterest() {

		return ((principal * time * rateofI)/100);

	}
}
