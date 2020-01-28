package com.codewars.challenges.tsp;

import org.junit.Test;

public class TSPTest {

	@Test
	public void test() {

		int numberOfNodes = 4;

		int[][] graph = { { 0, 10, 15, 20 }, { 10, 0, 35, 25 }, { 15, 35, 0, 30 }, { 20, 25, 30, 0 } };

		boolean[] visitedNodes = new boolean[numberOfNodes];

		visitedNodes[0] = true;
		int result = Integer.MAX_VALUE;
		int currentPosition = 0;

		int countOfTraverse = 1;
		int costOfTraversal = 0;
		result = TSP.minCycle(graph, visitedNodes, currentPosition, numberOfNodes, countOfTraverse, costOfTraversal,
				result);

		System.out.println(result);

	}

}
