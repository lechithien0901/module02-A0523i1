package ss017_binary_file.exercise.controller;

import ss017_binary_file.exercise.service.IServiceProduct;
import ss017_binary_file.exercise.service.ProductService;

import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);
    IServiceProduct iServiceProduct = new ProductService();

    public void isProductController() {
        int choiceOfProduct;
        do {
            System.out.println("Đây là danh sách");
            System.out.println("=================================");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm từ File");
            System.out.println("bấm một kí tự bất kí để thoát chương trình");
            System.out.println("=================================");
            System.out.println("mời bạn chọn chức năng của bạn");
            choiceOfProduct = Integer.parseInt(scanner.nextLine());
            switch (choiceOfProduct) {
                case 1:
                    System.out.println("bạn vừa chọn thêm sản phẩm");
                    iServiceProduct.addProduct();
                    break;
                case 2:
                    System.out.println("bạn vừa chọn hiển thị sản phẩm");
                    iServiceProduct.showProduct();
                    break;
                case 3:
                    System.out.println("bạn vừa chọn tìm kiếm sản phẩm theo tên");
                    iServiceProduct.findProduct();
                    break;

            }

        } while (choiceOfProduct >= 1 && choiceOfProduct <= 3);
    }
}
