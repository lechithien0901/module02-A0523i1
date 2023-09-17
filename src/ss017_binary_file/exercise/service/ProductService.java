package ss017_binary_file.exercise.service;

import ss017_binary_file.exercise.model.Product;
import ss017_binary_file.exercise.repository.IProductRespository;
import ss017_binary_file.exercise.repository.ProductRespository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IServiceProduct {
    Scanner scanner = new Scanner(System.in);
    IProductRespository iProductRespository = new ProductRespository();

    @Override
    public void addProduct() {
        System.out.println("mời bạn nhập id của sản phẩm");
        int idOfProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập mã sản phẩm");
        String stringOfProduct = scanner.nextLine();
        System.out.println("mời bạn nhập tên sản phẩm");
        String nameOfProduct = scanner.nextLine();
        System.out.println("mời bạn nhập giới thiệu về sản phẩm");
        String manufacturerOfProduct = scanner.nextLine();
        System.out.println("mời bạn nhập giá tiền sản phẩm")
        ;
        double priceOfProduct = Double.parseDouble(scanner.nextLine());
        Product productOfMe = new Product(idOfProduct, stringOfProduct, nameOfProduct, manufacturerOfProduct, priceOfProduct);
        iProductRespository.addProduct(productOfMe);

    }

    @Override
    public List<Product> showProduct() {
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList = (ArrayList<Product>) iProductRespository.showProduct();
        for (Product product :
                arrayList) {
            System.out.println(product);
        }
        return arrayList;
    }

    @Override
    public void findProduct() {
        System.out.println("mời bạn nhập một tên cần kiểm tra");
        String stringOfMe=scanner.nextLine();
        iProductRespository.findProduct(stringOfMe);

    }
}
