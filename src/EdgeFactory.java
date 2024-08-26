public abstract class EdgeFactory<Weight>{

      abstract public Edge createEdge(Node u,Node v);
      abstract public WeightedEdge<Weight> createWeightedEdge(Node u,Node v,Weight weight);

}

class DirectedEdgeFactory<Weight> extends EdgeFactory<Weight>{

    @Override
    public Edge createEdge(Node u, Node v) {
        return new DirectedEdge<>(u,v);
    }

    @Override
    public WeightedEdge<Weight> createWeightedEdge(Node u, Node v, Weight weight) {
        return new DirectedEdge<>(u, v, weight);
    }
}
class UndirectedEdgeFactory<Weight> extends EdgeFactory<Weight>{

    @Override
    public Edge createEdge(Node u, Node v) {
        return new UnDirectedEdge<>(u,v);
    }

    @Override
    public WeightedEdge<Weight> createWeightedEdge(Node u, Node v, Weight weight) {
        return new UnDirectedEdge<>(u, v, weight);
    }
}
