package ss10_dsa.pratice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Smartphone", 599.99));
        products.add(new Product("Laptop", 1299.99));
        products.add(new Product("Tablet", 349.99));
        products.add(new Product("Smart TV", 799.99));

        String searchTerm = "tab";

        List<Product> searchResults = ProductSearch.searchByName(products, searchTerm);

        if (searchResults.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("Search results:");
            for (Product result : searchResults) {
                System.out.println(result.getName() + " - $" + result.getPrice());
            }
        }
    }
}




