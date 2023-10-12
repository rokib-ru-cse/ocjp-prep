package chapterten;

public class Composition {
}


interface Box {
    void pack();

    void seal();
}

class GiftBox implements Box {
    public void pack() {
        System.out.println("pack box");
    }

    public void seal() {
        System.out.println("seal box");
    }
}

