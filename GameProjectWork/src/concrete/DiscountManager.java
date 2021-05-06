package concrete;

import interfaces.DiscountService;

public class DiscountManager implements DiscountService {

	@Override
	public double discountCalculator(double price, int discount) {
		return (price*discount)/100;
	}

}
