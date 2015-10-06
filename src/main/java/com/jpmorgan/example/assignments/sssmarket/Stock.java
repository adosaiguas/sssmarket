package com.jpmorgan.example.assignments.sssmarket;

public class Stock {
	
	private String symbol;
	private String type;
	private Double lastDividend;
	private Double fixedDividend;
	private Double parValue;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(Double lastDividend) {
		this.lastDividend = lastDividend;
	}

	public Double getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividend(Double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	public Double getParValue() {
		return parValue;
	}

	public void setParValue(Double parValue) {
		this.parValue = parValue;
	}

	public Stock(String symbol, String type, Double lastDividend, Double fixedDividend, Double parValue) {
		this.setSymbol(symbol);
		this.setType(type);
		this.setLastDividend(lastDividend);
		this.setFixedDividend(fixedDividend);
		this.setParValue(parValue);
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", type=" + type + ", lastDividend="
				+ lastDividend + ", fixedDividend=" + fixedDividend
				+ ", parValue=" + parValue + "]";
	}

	public Double dividend(Double price) throws Exception {
		switch(this.getType()) {
			case "Common":
				return this.getLastDividend()/price;
			case "Preferred":
				return this.getFixedDividend()*this.getParValue()/price;
			default:
				throw new Exception("Unsupported stock type");
		}
	}
	
	public Double PERatio(Double price) {
		return price/this.getLastDividend();
	}

}
