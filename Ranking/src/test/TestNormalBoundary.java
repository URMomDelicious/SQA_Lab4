package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import main.Ranking;



class TestNormalBoundary {

Ranking ranking = new Ranking();

	
	@Test
	@DisplayName("T01  result = silver,purchaseTotal = 10000(min),frequency = 1(nom) ,pointCollected = 500(nom)")
	void test_01() {
		String result = Ranking.calculateRank(10000, 1, 500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T02  result = silver,purchaseTotal = 10001(min+),frequency = 1(nom) ,pointCollected = 500(nom)")
	void test_02() {
		String result = Ranking.calculateRank(10001, 1,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T03  result = Gold,purchaseTotal = 50000(nom),frequency = 5(nom) ,pointCollected = 500(nom)")
	void test_03() {
		String result = Ranking.calculateRank(50000, 5,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T04  result = Gold,purchaseTotal = 99999(max-),frequency = 29(nom) ,pointCollected = 500(nom)")
	void test_04() {
		String result = Ranking.calculateRank(99999, 30,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T05  result = Gold,purchaseTotal = 100000(max),frequency = 30(nom) ,pointCollected = 500(nom)")
	void test_05() {
		String result = Ranking.calculateRank(100000, 30,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T06  result = silver,purchaseTotal = 50000(nom),frequency = 15(min) ,pointCollected = 500(nom)")
	void test_06() {
		String result = Ranking.calculateRank(50000, 15,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T07  result = silver,purchaseTotal = 50000(nom),frequency = 2(min+) ,pointCollected = 500(nom)")
	void test_07() {
		String result = Ranking.calculateRank(50000, 2,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T08  result = Gold,purchaseTotal = 50000(nom),frequency = 29(max-) ,pointCollected = 500(nom)")
	void test_08() {
		String result = Ranking.calculateRank(50000, 29,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T09  result = Gold,purchaseTotal = 50000(nom),frequency = 30(max) ,pointCollected = 500(nom)")
	void test_09() {
		String result = Ranking.calculateRank(50000, 30,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T10  result = Silver,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 100(min)")
	void test_10() {
		String result = Ranking.calculateRank(50000, 15,100);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T11  result = Silver,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 101(min+)")
	void test_11() {
		String result = Ranking.calculateRank(50000, 15,101);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T12  result = Gold,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 999(max-)")
	void test_12() {
		String result = Ranking.calculateRank(50000, 30,999);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T13  result = Gold,purchaseTotal = 100000(nom),frequency = 15(nom) ,pointCollected = 1000(max)")
	void test_13() {
		String result = Ranking.calculateRank(50000, 15,1000);
		assertEquals("Platinum", result);
	}
}
