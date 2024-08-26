package GraphLib;

public class WeightedNode<Weight> extends Node {

    private Weight w;

    WeightedNode(String label) {
        super(label);
        this.w = null;
    }

    WeightedNode(String label, Weight w) {
        super(label);
        this.w = w;
    }

    Weight getWeight() {
        return w;
    }

    void setWeight(Weight w) {
        this.w = w;
    }

}
