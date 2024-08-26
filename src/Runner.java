
import java.util.List;

public class Runner {
    public static void main(String[] args) {

         EdgeFactory ef = new UndirectedEdgeFactory();

         Node x = new Node("x");
         Node y = new Node("y");

         Edge e = ef.createEdge(x, y);
         Edge e2 = ef.createEdge(y, x);

         System.out.println(e.HasDirection());
         System.out.println(e.equals(e2));

         ef = new DirectedEdgeFactory();

         e = ef.createEdge(x, y);
         e2 = ef.createEdge(y, x);

         System.out.println(e.HasDirection());
         System.out.println(e.equals(e2));

    }
}
