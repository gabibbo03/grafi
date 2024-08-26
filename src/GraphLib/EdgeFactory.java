package GraphLib;

public abstract class EdgeFactory<Weight> {

    abstract public Edge createEdge(Node u, Node v);

    abstract public WeightedEdge<Weight> createWeightedEdge(Node u, Node v, Weight weight);

}

