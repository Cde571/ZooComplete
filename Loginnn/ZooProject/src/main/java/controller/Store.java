package controller;


import model.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<Habitat> listHabitat = new ArrayList<>();
    private static List<Product> listProduct = new ArrayList<>();
    public void addHabitat(Habitat habitat){
        listHabitat.add(habitat);
    }
    public void addProducto(Product product){
        listProduct.add(product);
    }
    public Habitat getHabitat(int index){
        return listHabitat.get(index);
    }
    public Product getProduct(int index){
        return listProduct.get(index);
    }
}
