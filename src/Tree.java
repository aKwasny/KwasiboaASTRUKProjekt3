/**
 * Created by Andrzej on 2015-10-31.
 */
public class Tree {

    private class Node () {
        class Item {
            private double value;
            private int index;
        }
        class Node *left *right
    } *root;

    public void insert (int i, double v) {

    }

    double get (int i) {

    }

    void Test () {
        Test(root);
    }

    void Test (class Node *r) {
        if (r == 0) return;
        Test(r->left);
        //drukowanie zawartoœci np cout << '\n indeks= " << r->index << " war=" << r->value;
        Test(r->right);
    }
}
