import org.jgrapht.*;
import org.jgrapht.graph.*;
public final class Main
{
	public static void main(final String[] args)
	{
		Graph<String, DefaultEdge> stringGraph = createStringGraph();
		System.out.println(stringGraph.toString());
	}
	private static Graph<String, DefaultEdge> createStringGraph()
	{
		Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
		String v1 = "v1";
		String v2 = "v2";
		g.addVertex(v1);
		g.addVertex(v2);
		g.addEdge(v1, v2);
		return g;
	}
}
