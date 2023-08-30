package ss10_dsa.pratice;


import java.util.ArrayList;
import java.util.List;

class ProductSearch {
        public static List<Product> searchByName(List<Product> products, String searchTerm) {
            List<Product> searchResults = new ArrayList<>();

            for (Product product : products) {
                if (product.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                    searchResults.add(product);
                }
            }

            return searchResults;
        }
    }


