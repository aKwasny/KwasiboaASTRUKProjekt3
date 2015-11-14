import java.io.*;
import java.util.*;

/**
 * Created by Andrzej on 2015-10-31.
 */
public class Vector {
    Tree tree;

    public Vector() {
        this.tree = new Tree();
    }

    public void insert (int index, double value) {
        tree.add(index, value);
    }

    public double get (int index) {
        return tree.get(index);
    }

    public void eject () {
        tree.eject();
    }

    public static void main(String[] args) {
        Vector vector = new Vector();

        try {
            Scanner input = new Scanner(new File("data.txt"));
            while (input.hasNextInt()) {
                int index = input.nextInt();
                double value = input.nextDouble();
                vector.insert(index, value);
            }
        } catch (FileNotFoundException noFile) {
            noFile.printStackTrace();
            System.out.println("Error! No file found!");
        }

        vector.eject();

    }
}
