package graphs;

import java.util.*;

public class bfs {

    private LinkedList<Integer> adj[];
	
	public bfs(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void printbfs() {
		for(int i = 0; i < adj.length; i++) {
			System.out.print(i + " --> " + adj[i]);
			System.out.println();
		}
	}
	
	public int bfs(int source, int destination) {
		boolean[] visited = new boolean[adj.length];
		Queue<Integer> q = new LinkedList<>();
		int[] parent = new int[adj.length];
		
		q.add(source);
		parent[source] = -1;
		visited[source] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			if(curr == destination) break;
			for(int e : adj[curr]) {
				if(!visited[e]) {
					visited[e] = true;
					q.add(e);
					parent[e] = curr;
				}
			}
		}
		
		int curr = destination;
		int dest = 0;
		while(parent[curr] != -1) {
			System.out.print(curr + " --> ");
			curr = parent[curr];
			dest++;
		}
		System.out.print(source);
		System.out.println();
		
		return dest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vertices and edges : ");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		bfs bfs = new bfs(v);
		
		System.out.println("Enter " + e + " edges : ");
		
		for(int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			bfs.addEdge(source, destination);
		}
		
		bfs.printbfs();
		
		System.out.println("Enter source and destination to find shortest path : ");
		int source = sc.nextInt();
		int destination = sc.nextInt();
		int distance = bfs.bfs(source, destination);
		System.out.println("Minimum distance is : " + distance);
	}

}
