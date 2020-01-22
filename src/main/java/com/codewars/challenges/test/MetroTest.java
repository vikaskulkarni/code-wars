package com.codewars.challenges.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.codewars.challenges.code.Metro;

public class MetroTest {
	@Test
	public void test1() {
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] { 10, 0 });
		list.add(new int[] { 3, 5 });
		list.add(new int[] { 2, 5 });
		assertEquals(5, Metro.countPassengers(list));
	}

}
