package GraphLib;

import java.util.Objects;

public abstract class Edge {

    private Node u;
    private Node v;
    private boolean HasDirection;


    public Edge(Node u, Node v, boolean d) throws CloneNotSupportedException {
        this.u = Objects.requireNonNull(u.clone(), "Node u cannot be null");
        this.v = Objects.requireNonNull(v.clone(), "Node v cannot be null");
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

