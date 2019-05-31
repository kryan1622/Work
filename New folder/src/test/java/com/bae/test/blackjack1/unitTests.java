package com.bae.test.blackjack1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack1.mainapp.BlackJack;

public class unitTests {
	static BlackJack blackjack;

	@BeforeClass
	public static void setup() {
		blackjack = new BlackJack();
	}

	@Test
	public void test2() {
		assertEquals(21, blackjack.play(0, 21));
	}

	@Test
	public void test3() {
		assertEquals(21, blackjack.play(21, 0));
	}

	@Test
	public void test4() {
		assertEquals(10, blackjack.play(10, 10));

	}

	@Test
	public void test5() {
		assertEquals(21, blackjack.play(30, 21));
	}

	@Test
	public void test6() {
		assertEquals(-1, blackjack.play(31, 22));
	}

	@Test
	public void test7() {
		assertEquals(0, blackjack.play(30, 22));
	}

	@Test
	public void test8() {
		assertEquals(10, blackjack.play(25, 10));
	}

	@Test
	public void test9() {
		assertEquals(10, blackjack.play(10, 25));
	}

	@Test
	public void test10() {
		assertEquals(0, blackjack.play(25, 25));
	}

	@Test
	public void test11() {
		assertEquals(21, blackjack.play(10, 21));
	}

	@Test
	public void test12() {
		assertEquals(21, blackjack.play(21, 10));
	}

	@Test
	public void test13() {
		assertEquals(-1, blackjack.play(31, 31));
	}

	@Test
	public void test14() {
		assertEquals(-1, blackjack.play(1, 1));
	}

	@Test
	public void test15() {
		assertEquals(10, blackjack.play(10, 31));
	}

	@Test
	public void test16() {
		assertEquals(-1, blackjack.play(31, 10));
	}

	@Test
	public void test17() {
		int a = blackjack.twist(10);
		assertEquals(10 + a, blackjack.play(25, 10 + a));

	}

	ArrayList<Integer> myList = new ArrayList<Integer>();

	public void listtest() {
		for (int i = 0; i < 100; i++) {
			myList.add(blackjack.twist(i));
		}

	     for (int a :myList)
		 {
		 if (a > 0 && a < 12) {
			 continue;
		 }
		 else { 
			 fail("Expected value between 1 & 11 but got" + a);
			 
		 }
	}
	}


}
