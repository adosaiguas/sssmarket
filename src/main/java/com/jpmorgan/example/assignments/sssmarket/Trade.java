package com.jpmorgan.example.assignments.sssmarket;

import com.jpmorgan.example.assignments.sssmarket.enums.TradeType;

public class Trade {
	
	private TradeType type;
	private Integer quantity;
	private Double price;

	public TradeType getType() {
		return type;
	}

	public void setType(TradeType type) {
		this.type = type;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Trade(TradeType type, Integer quantity, Double price) {
		this.setType(type);
		this.setQuantity(quantity);
		this.setPrice(price);
	}

	@Override
	public String toString() {
		return "Trade [type=" + type + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
}
