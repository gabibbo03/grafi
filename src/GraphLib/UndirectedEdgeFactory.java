package GraphLib;

public class UndirectedEdgeFactory<Weight> extends EdgeFactory<Weight> {

    @Override
    public Edge createEdge(Node u, Node v) {
        return new UnDirectedEdge<>(u, v);
    }

    @Override
    public WeightedEdge<Weight> createWeightedEdge(Node u, Node v, Weight weight) {
        return new UnDirectedEdge<>(u, v, weight);
    }
}
