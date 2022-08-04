package com.pattern.creational;

/**
 * @author Karthigeyan Vellasamy
 * Factory Pattern
 */
public class FactoryPattern {

	public static void main(String[] args) {
		AbstractTelecom company = TelecomFactory
				.getDetails(TelecomCompany.BSNL);
		company.getDetails();
	}
}

// Factory Method
class TelecomFactory {

	public static AbstractTelecom getDetails(TelecomCompany company) {
		switch (company) {
		case BSNL:
			return new Bsnl(04, "3400Rs", "NO");
		case VERIZON:

			return new Verizon(03, "5000$", "YES");
		case TMOBILE:

			return new TMobile(02, "6000$", "YES");
		}

		return null;
	}

}

abstract class AbstractTelecom {
	public abstract void getDetails();
}

enum TelecomCompany {
	BSNL, VERIZON, TMOBILE
}

class Bsnl extends AbstractTelecom {

	int rating;
	String StockPrice;
	String usProduct;

	public Bsnl(int rating, String stockPrice, String usProduct) {
		super();
		this.rating = rating;
		StockPrice = stockPrice;
		this.usProduct = usProduct;
	}

	@Override
	public void getDetails() {
		System.out.println("BSNL Details");
		System.out.println("=====================");
		System.out.println("Rating :" + rating + " StockPrice :" + StockPrice
				+ " usProduct :" + usProduct);
	}

}

class Verizon extends AbstractTelecom {

	int rating;
	String StockPrice;
	String usProduct;

	public Verizon(int rating, String stockPrice, String usProduct) {
		super();
		this.rating = rating;
		StockPrice = stockPrice;
		this.usProduct = usProduct;
	}

	@Override
	public void getDetails() {
		System.out.println("Verizon Details");
		System.out.println("=====================");
		System.out.println("Rating :" + rating + " StockPrice :" + StockPrice
				+ " usProduct :" + usProduct);

	}

}

class TMobile extends AbstractTelecom {

	int rating;
	String StockPrice;
	String usProduct;

	public TMobile(int rating, String stockPrice, String usProduct) {
		super();
		this.rating = rating;
		StockPrice = stockPrice;
		this.usProduct = usProduct;
	}

	@Override
	public void getDetails() {
		System.out.println("TMobile Details");
		System.out.println("=====================");
		System.out.println("Rating :" + rating + " StockPrice :" + StockPrice
				+ " usProduct :" + usProduct);
	}

}