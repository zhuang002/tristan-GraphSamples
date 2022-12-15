
public class Graph2DArrayBidirectional extends Graph2DArray {
	@Override
	public void loadGraph() {
		super.loadGraph();
		for (int i=0;i<this.table.length;i++) {
			for (int j=i+1;j<this.table[0].length;j++) {
				if (table[i][j]>0) {
					table[j][i] = table[i][j];
				}
			}
		}
	}
	
	@Override
	public void printGraph() {
		int nNodes = this.getNoNodes();
		int nPaths = this.getNoPaths() /2 ;
		System.out.println(nNodes+" "+nPaths);
		
		for (int i=0;i<this.table.length;i++) {
			for (int j=i+1;j<this.table[0].length;j++) {
				if (table[i][j]>0) {
					System.out.println(i+" "+j+" "+table[i][j]);
				}
			}
		}
	} 
}
