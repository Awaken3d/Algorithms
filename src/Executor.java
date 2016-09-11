
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnionFind uf = new UnionFind(5);
		uf.unionSet(0, 1);
		uf.printParents();
		uf.unionSet(2, 3);
		uf.printParents();
		uf.unionSet(4, 3);
		uf.printParents();
	}

}
