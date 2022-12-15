import java.util.Scanner;

public class Graph2DArray {
	protected int[][] table = null;
	
	
	public int getNoNodes() {
		return this.table.length;
	}
	
	public int getNoPaths() {
		int count = 0;
		for (int i=0;i<this.table.length;i++) {
			for (int j=0;j<this.table[0].length;j++) {
				if (table[i][j]>0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public void loadGraph() {
		Scanner sc = new Scanner(System.in);
		int nNodes = sc.nextInt();
		// create the table and initialize all cells to 0;
		table = new int[nNodes][nNodes];
		for (int i=0;i<nNodes;i++) {
			for (int j=0;j<nNodes;j++) {
				table[i][j] = 0;
			}
		}
		// read no. of paths.
		int nPaths = sc.nextInt();
		
		// read all paths
		for (int i=0;i<nPaths;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int length = sc.nextInt();
			table[start][end] = length;
		}
		
	}
	
	public void printGraph() {
		int nNodes = this.getNoNodes();
		int nPaths = this.getNoPaths();
		System.out.println(nNodes+" "+nPaths);
		for (int i=0;i<nNodes;i++) {
			for (int j=0;j<nNodes;j++) {
				if (table[i][j]>0) {
					System.out.println(i+" "+j+" "+table[i][j]);
				}
			}
		}
	}
	
}
