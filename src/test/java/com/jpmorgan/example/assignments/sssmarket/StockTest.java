package com.jpmorgan.example.assignments.sssmarket;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jpmorgan.example.assignments.sssmarket.enums.StockType;

public class StockTest {

	@Test
	public void testDividend() {
        Stock stockALE = new Stock("ALE", StockType.COMMON, 23.0, 0.0, 60.0);
        Stock stockGIN = new Stock("GIN", StockType.PREFERRED, 8.0, 0.2, 100.0);
		Double dividendALE = stockALE.dividend(1.0);
		Double expectedDividendALE = stockALE.getLastDividend()/1.0;
		assertEquals(expectedDividendALE, dividendALE, 0.0);
		Double dividendGIN = stockGIN.dividend(1.0);
		Double expectedDividendGIN = stockGIN.getFixedDividend()*stockGIN.getParValue()/1.0;
		assertEquals(expectedDividendGIN, dividendGIN, 0.0);
	}

	@Test
	public void testPERatio() {
        Stock stockALE = new Stock("ALE", StockType.COMMON, 23.0, 0.0, 60.0);
        Double peRatioALE = stockALE.PERatio(1.0);
        Double expectedPeRatioALE = 1.0/stockALE.getLastDividend();
        assertEquals(expectedPeRatioALE, peRatioALE, 0.0);
	}

	@Test
	public void testBuy() {
		Stock stockALE = new Stock("ALE", StockType.COMMON, 23.0, 0.0, 60.0);
		stockALE.buy(1, 10.0);
		assertEquals(10.0, stockALE.getPrice(), 0.0);
	}

	@Test
	public void testSell() {
		Stock stockALE = new Stock("ALE", StockType.COMMON, 23.0, 0.0, 60.0);
		stockALE.sell(1, 10.0);
		assertEquals(10.0, stockALE.getPrice(), 0.0);
	}

	@Test
	public void testGetPrice() {
		Stock stockALE = new Stock("ALE", StockType.COMMON, 23.0, 0.0, 60.0);
		stockALE.sell(1, 10.0);
		stockALE.buy(1, 11.0);
		assertEquals(11.0, stockALE.getPrice(), 0.0);
	}

	@Test
	public void testCalculateVolumeWeigthedStockPrice() {
		Stock stockALE = new Stock("ALE", StockType.COMMON, 23.0, 0.0, 60.0);
		stockALE.sell(2, 10.0);
		stockALE.buy(2, 10.0);		
		Double volumeWeigthedStockPrice = stockALE.calculateVolumeWeigthedStockPrice();
		assertEquals(10.0, volumeWeigthedStockPrice, 0.0);		
	}

}
