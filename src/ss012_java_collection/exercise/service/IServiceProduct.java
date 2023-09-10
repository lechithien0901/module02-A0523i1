package ss012_java_collection.exercise.service;

import ss012_java_collection.exercise.model.Product;

import java.util.ArrayList;

public interface IServiceProduct {
    void addProduct();

    void fixProduct();

    void deletProduct();

    ArrayList<Product> findAllProduct();

    void SearchProductsByName();

    void ProductArrangements();

}
