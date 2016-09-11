
public class UnionFind {
	private int[] rank;
	private int[] p;

	public UnionFind(int n) {
		rank = new int[n];
		p = new int[n];

		for (int i = 0; i < n; i++) {
			rank[i] = 0;
			p[i] = i;
		}
	}

	public int findSet(int i) {
		if (p[i] == i) {
			return i;
		} else {
			return findSet(p[i]);
		}
	}

	public void unionSet(int a, int b) {
		int aParent = findSet(a);
		int bParent = findSet(b);

		if (rank[aParent] > rank[bParent]) {
			p[bParent] = aParent;
			rank[aParent]++;
		} else {
			p[aParent] = bParent;
			rank[bParent]++;
		}
	}

	public int getParent(int i) {
		return p[i];
	}

	public int getRank(int i) {
		return rank[i];
	}
	
	public void printParents() {
		System.out.println("Printing info: ---------------------");
		for(int j = 0;j< p.length;j++) {
			System.out.println("for j: "+j);
			System.out.println("parent is: "+p[j]);
			System.out.println("rank is: "+rank[j]);
		}
	}
}
