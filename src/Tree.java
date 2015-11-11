/**
 * Created by Andrzej on 2015-10-31.
 */
public class Tree {
    Node head;

    public Tree {
        head = null;
    }

    public void add (int index, double value) {
        if (head == null) {
            head = new Node(index, value);
        } else {
            head.insert(index, value);
        }
    }

    public double get (int index) {
        return head.get(index);
    }

}
