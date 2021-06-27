package foreignProjects;

import java.util.Scanner;

public class Graphs {

	private char[][] adj;
	
	//* a constructor which takes number of vartices v as an argumnet
	//* and initializes a matrix with v number of rows and columns *//
	public Graphs(int v) {
		adj = new char[v][v];
	}
	
	//* a method which adds edges between source & destination and a character to draw graph *//
	public void addEdge(int source, int destination, char ch) {
		adj[source][destination] = ch;
		adj[destination][source] = ch;
	}
	
	//* a method which prints a SQUARE GRAPH *//
	public void printGraph() {
		for(int i = 0; i < adj.length; i++) {
			System.out.print(i + "--> ");
			for(int j = 0; j < adj.length; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges : ");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println("Enter a character to draw the graph : ");
		char ch = sc.next().charAt(0);
		
		Graphs graph = new Graphs(v);
		System.out.println("Enter " + e + " edges : ");
		for(int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination, ch);
		}
		
		graph.printGraph();
	}

}
