package GraphLib;
import java.util.Objects;

public class UnDirectedEdge<Weight> extends WeightedEdge<Weight> {

    public UnDirectedEdge(Node u, Node v) {
        super(u, v, null, false);

        if (u.equals(v)) {
            throw new IllegalArgumentException("Vertex cannot be the same");
        }
    }


    public UnDirectedEdge(Node u, Node v, Weight w) {

        super(u, v, w, false);

        if (u.equals(v)) {
            throw new IllegalArgumentException("Vertex cannot be the same");
        }

    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof UnDirectedEdge<?> that) {
            if (getWeight() != null)
                return (getU().equals(that.getU()) && getV().equals(that.getV())) ||
                        (getU().equals(that.getV()) && getV().equals(that.getU())) &&
                                Objects.equals(getWeight(), that.getWeight());
            else
                return (getU().equals(that.getU()) && getV().equals(that.getV())) ||
                        (getU().equals(that.getV()) && getV().equals(that.getU()));
        }
        return false;
    }

}
