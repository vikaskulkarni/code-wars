package com.codewars.challenges.tsp;

public class TSP {

	public static int minCycle(int[][] graph, boolean[] visitedNodes, int currentPosition, int numberOfNodes,
			int countOfTraverse, int costOfTraversal, int result) {

		if (countOfTraverse == numberOfNodes && graph[currentPosition][0] > 0) {
			result = Math.min(result, costOfTraversal + graph[currentPosition][0]);
			return result;
		}

		for (int i = 0; i < numberOfNodes; i++) {
			if (visitedNodes[i] == false && graph[currentPosition][i] > 0) {

				visitedNodes[i] = true;
				result = minCycle(graph, visitedNodes, i, numberOfNodes, countOfTraverse + 1,
						costOfTraversal + graph[currentPosition][i], result);

				visitedNodes[i] = false;
			}
		}
		return result;
	}

}
