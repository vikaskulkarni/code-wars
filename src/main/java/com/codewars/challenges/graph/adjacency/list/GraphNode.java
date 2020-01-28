package com.codewars.challenges.graph.adjacency.list;

import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphNode {
	int value;
	List<GraphNode> neighbors = new LinkedList<>();
}
