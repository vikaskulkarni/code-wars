package com.codewars.challenges.graph.adjacency.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AdjacencyListGraph {

	public static void print() {
		List<LinkedList<GraphNode>> listsToBePrinted = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int numberOfCases = scanner.nextInt();
		scanner.nextLine();

		for (int c = 0; c < numberOfCases; c++) {
			LinkedList<GraphNode> allNodes = new LinkedList<>();
			String line = scanner.nextLine();
			int[] numberOfVE = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

			for (int i = 0; i < numberOfVE[1]; i++) {
				int[] ve = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

				GraphNode sourceNode = allNodes.stream().filter(node -> ve[0] == node.getValue()).findAny()
						.orElse(null);

				GraphNode destNode = allNodes.stream().filter(node -> ve[1] == node.getValue()).findAny().orElse(null);

				if (sourceNode == null) {
					GraphNode gn = new GraphNode();
					gn.setValue(ve[0]);
					sourceNode = gn;
					allNodes.add(sourceNode);
				}

				if (destNode == null) {
					GraphNode n1 = new GraphNode();
					n1.setValue(ve[1]);
					destNode = n1;
					allNodes.add(destNode);
				}

				sourceNode.getNeighbors().add(destNode);
				destNode.getNeighbors().add(sourceNode);
			}
			listsToBePrinted.add(allNodes);
		}
		scanner.close();

		listsToBePrinted
				.forEach((LinkedList<GraphNode> list) -> list.forEach((GraphNode node) -> extractNodesNeighbors(node)));

	}

	private static void extractNodesNeighbors(GraphNode node) {
		System.out.println();
		System.out.print(node.getValue() + "->");
		final AtomicInteger count = new AtomicInteger(0);
		List<GraphNode> neighbours = node.getNeighbors();

		neighbours.forEach((GraphNode neighbor) -> {
			count.getAndAdd(1);
			if (count.get() == neighbours.size())
				System.out.print(neighbor.getValue());
			else
				System.out.print(neighbor.getValue() + "->");
		});
		System.out.println();
	}

}
