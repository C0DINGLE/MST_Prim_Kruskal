// Zaki Lindo
// CS 303 - Algorithms and Analysis
// 05/03/2017
// Assignment - Chapter 11

// Imports --------------------------------------------------------------------------------
import java.util.*;
import java.io.*;

// Kruskal is a Minimum-Cost Spanning Tree Algorithm that connect 2
// trees in a spreading forest

public class Kruskal {

	// Methods ----------------------------------------------------------------------------
	// Preconditions:	Graph g is most likely not a minimum-spanning tree already
	// Parameters:		Graph g - A graph constructed and initialized in a different file 
	//					with fields graphRep, vertices, and edges
	// Returns:			A minimum spanning tree using Kruskals's algorithm
	public static Graph getMST(Graph g) {

		// Initialize an Edge [] so that I can build a heap with it
		Edge [] gedges = new Edge [g.edges.size()];

		// Fill Edge [] with edges from Graph g
		for (Edge e: g.edges)
			gedges.add(e);

		// Build MinHeap to sort edges
		MinHeap<Edge> minHeap = new MinHeap<Edge>(gedges, g.edges.size(), g.edges.size());
