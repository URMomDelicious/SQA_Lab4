package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Ranking;

class TestRobustness {

Ranking ranking = new Ranking();

	
	@Test
	@DisplayName("T01  result = silver,purchaseTotal = 10000(min),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_01() {
		String result = Ranking.calculateRank(10000, 4, 500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T02  result = silver,purchaseTotal = 10001(min+),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_02() {
		String result = Ranking.calculateRank(10001, 4,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T03  result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_03() {
		String result = Ranking.calculateRank(50000, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T04  result = Gold,purchaseTotal = 99999(max-),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_04() {
		String result = Ranking.calculateRank(99999, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T05  result = Gold,purchaseTotal = 10000(max),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_05() {
		String result = Ranking.calculateRank(10000, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T06  result = silver,purchaseTotal = 50000(nom),frequency = 1(min) ,pointCollected = 500(nom)")
	void test_06() {
		String result = Ranking.calculateRank(50000, 1,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T07  result = silver,purchaseTotal = 50000(nom),frequency = 2(min+) ,pointCollected = 500(nom)")
	void test_07() {
		String result = Ranking.calculateRank(50000, 2,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T08  result = Gold,purchaseTotal = 50000(nom),frequency = 6(max-) ,pointCollected = 500(nom)")
	void test_08() {
		String result = Ranking.calculateRank(50000, 6,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T09  result = Gold,purchaseTotal = 50000(nom),frequency = 7(max) ,pointCollected = 500(nom)")
	void test_09() {
		String result = Ranking.calculateRank(50000, 7,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T10  result = Silver,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 100(min)")
	void test_10() {
		String result = Ranking.calculateRank(50000, 4,100);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T11  result = Silver,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 101(min+)")
	void test_11() {
		String result = Ranking.calculateRank(50000, 4,101);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("T12  result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 999(max-)")
	void test_12() {
		String result = Ranking.calculateRank(50000, 4,999);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T13  result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 1000(max)")
	void test_13() {
		String result = Ranking.calculateRank(50000, 4,1000);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T14  result = Standard,purchaseTotal = 9999(min-),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_14() {
		String result = Ranking.calculateRank(9999, 4,500);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("T15  result = Gold,purchaseTotal = 100001(max+),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_15() {
		String result = Ranking.calculateRank(100001, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T16  result = Standard,purchaseTotal = 50000(nom),frequency = 0(min-) ,pointCollected = 500(nom)")
	void test_16() {
		String result = Ranking.calculateRank(50000, 0,500);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("T17  result = Gold,purchaseTotal = 50000(nom),frequency = 8(max+) ,pointCollected = 500(nom)")
	void test_17() {
		String result = Ranking.calculateRank(50000, 8,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("T18  result = Standard,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 99(min-)")
	void test_18() {
		String result = Ranking.calculateRank(50000, 4,99);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("T19  result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 1001(max+)")
	void test_19() {
		String result = Ranking.calculateRank(50000, 4,1001);
		assertEquals("Gold", result);
	}

}
