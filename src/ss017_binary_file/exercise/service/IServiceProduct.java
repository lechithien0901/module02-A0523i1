package ss017_binary_file.exercise.service;

import ss017_binary_file.exercise.model.Product;

import java.util.List;

public interface IServiceProduct {
    void addProduct();

    List<Product> showProduct();

    void findProduct();
}
