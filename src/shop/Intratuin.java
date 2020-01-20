package shop;

import shop.trees.ChristmasTree;

import java.util.List;

public class Intratuin {

    private List<Product> products;
    private List<ChristmasTree> trees;

    public Intratuin(List<Product> products, List<ChristmasTree> trees) {
        this.products = products;
        this.trees = trees;
    }

    public Intratuin(List<ChristmasTree> trees) {
        this.trees = trees;
    }

    public void printAllProducts() {
        getProducts().forEach(product -> {
            System.out.println("Product: " + product.getLabel());
            System.out.println("Price:  " + product.getPrice());
        });
    }

    public void turnAllTrees() {
        getTrees().forEach(tree -> System.out.println(tree.getLightMessage()));
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<ChristmasTree> getTrees() {
        return trees;
    }
}
