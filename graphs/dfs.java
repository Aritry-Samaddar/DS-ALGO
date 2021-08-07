package graphs;

import java.util.*;

public class dfs {

    private LinkedList<Integer> adj[];
	
	public dfs(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void printdfs() {
		for(int i = 0; i < adj.length; i++) {
			System.out.print(i + " --> " + adj[i]);
			System.out.println();
		}
	}
	
	private boolean dfsUtil(int source, int destination, boolean[] vis) {
		if(source == destination) return true;
		
		for(int neighbor : adj[source]) {
			if(!vis[neighbor]) {
				vis[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destination, vis);
				if(isConnected) return true;
			}
		}
		
		return false;
	}
	
	public boolean dfsStack(int source, int destination) {
		boolean[] vis = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		while(!stack.isEmpty()) {
			int curr = stack.pop();
			if(curr == destination) return true;
			for(int neighbor : adj[curr]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		
		return false;
	}
	
	public boolean dfs(int source, int destination) {
		boolean[] vis = new boolean[adj.length];
		vis[source] = true;
		return dfsUtil(source, destination, vis);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vertices and edges : ");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		dfs dfs = new dfs(v);
		
		System.out.println("Enter " + e + " edges : ");
		
		for(int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			dfs.addEdge(source, destination);
		}
		
		dfs.printdfs();
		
		System.out.println("Enter source and destination to find shortest path : ");
		int source = sc.nextInt();
		int destination = sc.nextInt();
		
//		System.out.println("Possible : " + dfs.dfs(source, destination));
		System.out.println("Possible : " + dfs.dfsStack(source, destination));
	}

}
