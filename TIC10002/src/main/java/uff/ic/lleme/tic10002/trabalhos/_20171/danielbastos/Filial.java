package uff.ic.lleme.tic10002.trabalhos._20171.danielbastos;

public class Filial {

    int key;
    AVLTree tree;

    public Filial(int k) {
        key = k;
        tree = new AVLTree();
    }

    @Override
    public String toString() {
        String ret = String.format("Filial(id: %d total: %.2f)", key);
        return ret;
    }

}
