import java.util.Objects;

public abstract class Edge {

    private Node u;
    private Node v;
    private boolean HasDirection;


    public Edge(Node u, Node v,boolean d) {
          this.u = Objects.requireNonNull(u.clone(),"Node u cannot be null");
          this.v = Objects.requireNonNull(v.clone(),"Node v cannot be null");
          this.HasDirection = d;
    }

    public Node getU() {
        return u;
    }

    public Node getV() {
        return v;
    }

    public boolean HasDirection() {
        return HasDirection;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

}

abstract class WeightedEdge<Weight> extends Edge {

    private Weight w;
    public WeightedEdge(Node u, Node v, Weight w, boolean d) {
        super(u, v, d);
        this.w = w;
    }

    public Weight getWeight() {
        return w;
    }

    public void setWeight(Weight w) {
        this.w = w;
    }

    @Override
    public int hashCode() {
        if(getWeight() != null)
            return Objects.hash(getU(), getV()) + Objects.hash(getWeight());
        else
            return Objects.hash(getU(), getV());
    }
}

