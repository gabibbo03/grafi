import java.util.Objects;

public class DirectedEdge<Weight> extends WeightedEdge<Weight> {

    public DirectedEdge(Node u, Node v) {
        super(u,v,null,true);
    }

    public DirectedEdge(Node u, Node v, Weight w) {
        super(u, v, w,true);
    }

    @Override
    public boolean equals(Object o) {
        if((o instanceof DirectedEdge)){
            DirectedEdge<?> that = (DirectedEdge<?>)o;
            if(getWeight() != null)
                return getU().equals(that.getU()) &&
                    getV().equals(that.getV()) &&
                    Objects.equals(getWeight(), that.getWeight());
            else
                return getU().equals(that.getU()) &&
                        getV().equals(that.getV());
        }
        return false;
    }

}

