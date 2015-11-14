/**
 * Created by Andrzej on 2015-10-31.
 */
public class Node {
    private int index;
    private Node left;
    private Node right;
    private double value;

    public Node(int index, double value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex () {
        return index;
    }

    public Node getRight () {
        return right;
    }

    public Node getLeft () {
        return left;
    }

    public double getValue () {
        return value;
    }

    public void insert (int index, double value) {
        if (index == this.index) {
            this.value = value;
        } else if (index > this.index) {
            if (this.right != null) {
                this.right.insert(index, value);
            } else {
                this.right = new Node(index, value);
            }
        } else if (index < this.index) {
            if (this.left != null) {
                this.left.insert(index, value);
            } else {
                this.left = new Node(index, value);
            }
        }
    }

    public double get (int index) {
        if (index == this.index) {
            return this.value;
        } else if (index > this.index) {
            if (this.right == null) {
                return 0;
            } else {
                return this.right.get(index);
            }
        } else if ( index < this.index) {
            if (this.left == null) {
                return 0;
            } else  {
                return this.left.get(index);
            }
        }
        return 0;
    }

    public void eject (int depthLevel) {
        if (this.right != null) {
            this.right.eject(depthLevel + 1);
        }

        String spaceBetween = "";
        for (int i = 0; i < depthLevel; i++) {
            spaceBetween = spaceBetween + "                    ";
        }

        System.out.println(spaceBetween + index + "----> " + value);

        if (this.left != null) {
            this.left.eject(depthLevel + 1);
        }
    }
}
