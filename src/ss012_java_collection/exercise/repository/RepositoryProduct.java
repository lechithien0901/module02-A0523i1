package ss012_java_collection.exercise.repository;

import ss012_java_collection.exercise.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RepositoryProduct implements IRepositoryProduct  {
    static ArrayList<Product> productArrayList = new ArrayList<>();
    public Comparator<Product> comparator=new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return (int) (o2.getSalaryOfProduct()- o1.getSalaryOfProduct());
        }

    };
    Comparator<Product>productComparator=new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getNameOfProduct().compareTo(o2.getNameOfProduct());
        }
    };

    static {
        productArrayList.add(new Product(0, "nguyen van a", 6000, "sản phẩm có màu vàng"));
        productArrayList.add(new Product(1, "nguyen van b", 4000, "sản phẩm có màu đỏ"));
        productArrayList.add(new Product(2, "nguyen van c", 5000, "sản phẩm có màu xanh"));
    }


    @Override
    public void addProduct(Product product) {
        productArrayList.add(product);

    }

    @Override
    public void fixProduct() {

    }

    @Override
    public void deletProduct(int id) {
        boolean check = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getIdOfProduct() == id) {
                System.out.println("phần tử bạn vừa xóa là" + productArrayList.get(i));
                productArrayList.remove(i);
                check = true;


            }


        }
        if (!check) {
            System.out.println("id bạn nhập không đúng");
        }

    }

    @Override
    public ArrayList<Product> findAllProduct() {
        return productArrayList;
    }

    @Override
    public void SearchProductsByName(String name) {
        boolean check=false;
        for (int i = 0; i <productArrayList.size() ; i++) {
            if (productArrayList.get(i).getNameOfProduct().equals(name)){
                System.out.println(productArrayList.get(i));
                check=true;
            }

        }
        if (!check){
            System.out.println("xin lỗi sản phẩm của bạn hiện tại không có trong hệ thống");
        }

    }

    @Override
    public void ProductArrangements(int choice) {
        switch (choice){
            case 1:
                System.out.println("bạn đã chọn sắp xếp tăng dần theo giá tiền");
                Collections.sort(productArrayList,Product::compareTo);
                for (Product product:productArrayList){
                    System.out.println(product);
                }


                break;
            case 2:
                System.out.println("bạn đã chọn sắp xếp giảm dần");
                Collections.sort(productArrayList,comparator);
                for(Product product:productArrayList){
                    System.out.println(product);
                }
                break;
        }


    }
}
