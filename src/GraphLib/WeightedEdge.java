package GraphLib;

import java.util.Objects;

public abstract class WeightedEdge<Weight> extends Edge {

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
        if (getWeight() != null)
            return Objects.hash(getU(), getV()) + Objects.hash(getWeight());
        else
            return Objects.hash(getU(), getV());
    }
}
