package shop;

import shop.trees.IChristmasTree;

import java.util.List;

public class Intratuin {

    private List<Product> products;
    private List<IChristmasTree> trees;

    public Intratuin(List<Product> products, List<IChristmasTree> trees) {
        this.products = products;
        this.trees = trees;
    }

    public void printAllProducts() {
        getProducts().forEach(product -> {
            System.out.println("Product: " + product.getLabel());
            System.out.println("Price:  " + product.getPrice());
        });
    }

    private void turnAllTrees() {
        getTrees().forEach(tree -> {
            System.out.println(tree.getLightMessage());
        });
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<IChristmasTree> getTrees() {
        return trees;
    }
}
