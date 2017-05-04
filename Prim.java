// Zaki Lindo
// CS 303 - Algorithms and Analysis
// 05/03/2017
// Assignment - Chapter 11

// Imports --------------------------------------------------------------------------------
import java.util.*;
import java.io.*;

// Prim is a Minimum-Cost Spanning Tree Algorithm that grows a single tree starting from 
// a single node(vertex)

public class Prim {

	// Methods ----------------------------------------------------------------------------
	// Preconditions:	Graph g is most likely not a minimum-spanning tree already
	// Parameters:		Graph g - A graph constructed and initialized in a different file 
	//					with fields graphRep, vertices, and edges
	// Returns:			A minimum spanning tree using Prim's algorithm
	public static Graph getMST(Graph g) {

		// Make sure everything is unvisited
		g.clear();

		// Construct a MinHeap with the edges of Graph g
		MinHeap<Edge> minHeap = new MinHeap<Edge>(g.edges, g.edges.size(), 0);
		
		// Build edge and vertex arraylists to store both respectively
		ArrayList<Edge> edges = new ArrayList<Edge>();
		ArrayList<Vertex> vertices = new ArrayList<Vertex>().add(minHeap.removeMin().source);

		// Makes sure I add only the amount of vertices that are in g
		while(vertices.size() < g.vertices.size()) {
			Edge e = minHeap.removeMin();
			if (!e.source.visited) {
				e.source.visited = True;
				vertices.add(e.source);
				edges.add(e);
			}
		}
	}
}