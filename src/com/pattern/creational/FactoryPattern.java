package com.pattern.creational;

/**
 * @author Karthigeyan Vellasamy Factory Pattern
 */
public class FactoryPattern {

	public static void main(String[] args) {
		AbstractTelecom company = TelecomFactory
				.getDetails(TelecomCompany.AT_T);
		company.getDetails();
	}
}


enum TelecomCompany {
	AT_T, VERIZON, TMOBILE
}

// Factory Method
class TelecomFactory {

	public static AbstractTelecom getDetails(TelecomCompany company) {
		switch (company) {
		case AT_T:
			return new Atnt(04, "8000$");
		case VERIZON:
			return new Verizon(03, "5000$");
		case TMOBILE:
			return new TMobile(02, "6000$");
		}

		return null;
	}

}

abstract class AbstractTelecom {
	public abstract void getDetails();
}


class Atnt extends AbstractTelecom {

	int rating;
	String StockPrice;

	public Atnt(int rating, String stockPrice) {
		super();
		this.rating = rating;
		StockPrice = stockPrice;
	}

	@Override
	public void getDetails() {
		System.out.println("Atnt Details");
		System.out.println("=====================");
		System.out.println("Rating :" + rating + " StockPrice :" + StockPrice);
	}

}

class Verizon extends AbstractTelecom {

	int rating;
	String StockPrice;

	public Verizon(int rating, String stockPrice) {
		super();
		this.rating = rating;
		StockPrice = stockPrice;
	}

	@Override
	public void getDetails() {
		System.out.println("Verizon Details");
		System.out.println("=====================");
		System.out.println("Rating :" + rating + " StockPrice :" + StockPrice);

	}

}

class TMobile extends AbstractTelecom {

	int rating;
	String StockPrice;

	public TMobile(int rating, String stockPrice) {
		super();
		this.rating = rating;
		StockPrice = stockPrice;
	}

	@Override
	public void getDetails() {
		System.out.println("TMobile Details");
		System.out.println("=====================");
		System.out.println("Rating :" + rating + " StockPrice :" + StockPrice);
	}

}