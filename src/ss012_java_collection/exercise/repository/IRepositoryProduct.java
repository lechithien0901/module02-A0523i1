package ss012_java_collection.exercise.repository;

import ss012_java_collection.exercise.model.Product;

import java.util.ArrayList;

public interface IRepositoryProduct {
    void addProduct(Product product);

    void fixProduct();

    void deletProduct(int id);

    ArrayList<Product> findAllProduct();

    void SearchProductsByName(String name);

    void ProductArrangements(int choice);

}
