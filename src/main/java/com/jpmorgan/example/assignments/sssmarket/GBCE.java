package com.jpmorgan.example.assignments.sssmarket;

import java.util.Map;

public class GBCE {

	/**
	 * Calculate the GBCE All Share Index for all stocks
	 * 
	 * @param stocks The Stock DB
	 * @return The GBCE All Share Index
	 */
	public static Double allShareIndex(Map<String, Stock> stocks) {
		Double allShareIndex = 0.0;
		for(Stock stock: stocks.values()) {
			allShareIndex+=stock.getPrice();
		}
		return Math.pow(allShareIndex, 1.0 / stocks.size());
	}
	
}
