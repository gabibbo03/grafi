package GraphLib;

public class DirectedEdgeFactory<Weight> extends EdgeFactory<Weight> {

    @Override
    public Edge createEdge(Node u, Node v) {
        return new DirectedEdge<>(u, v);
    }

    @Override
    public WeightedEdge<Weight> createWeightedEdge(Node u, Node v, Weight weight) {
        return new DirectedEdge<>(u, v, weight);
    }
}
