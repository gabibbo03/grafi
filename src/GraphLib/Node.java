package GraphLib;

public class Node implements Cloneable {

    private String Label;
    private final long UniqueNumer; //numero identificativo univoco per ogni istanza di nodo.
    private static long Counter = 0; //Tiene conto del numero di nodi

    public Node(String label) {
        this.Label = label;
        Counter++;
        UniqueNumer = Counter;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        this.Label = label;
    }

    public long getUniqueNumer() {
        return UniqueNumer; //just debug lol
    }

    public int hashcode() {
        return getLabel().hashCode() + (int) getUniqueNumer();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            Node n = (Node) obj;
            return n.getUniqueNumer() == UniqueNumer;
        }
        return false;
    }

    @Override
    protected Node clone() throws CloneNotSupportedException {
        Node x = new Node(Label);
        return x;
    }
}

