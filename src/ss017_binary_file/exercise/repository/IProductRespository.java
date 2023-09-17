package ss017_binary_file.exercise.repository;

import ss017_binary_file.exercise.model.Product;

import java.util.List;

public interface IProductRespository {
    void addProduct(Product product);

    List<Product> showProduct();

    void findProduct(String name);
}

