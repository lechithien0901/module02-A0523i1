package ss012_java_collection.exercise.controller;

import ss012_java_collection.exercise.service.IServiceProduct;
import ss012_java_collection.exercise.service.ServiceProduct;

import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    IServiceProduct iServiceProduct = new ServiceProduct();

    public void disPlay() {


        int choice = 0;
        do {
            System.out.println("đây là danh sách Product gồm : ");
            System.out.println("==============================================");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa sản phẩm thêm id");
            System.out.println("3.Xóa sản phẩm theo id");
            System.out.println("4.Hiển thị sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên ");
            System.out.println("6.sắp xếp sản phẩm");
            System.out.println("nhấn một số bất kì để thoát khỏi menu");
            System.out.println("==============================================");
            System.out.println("mời bạn nhập lựa chọn của bạn : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("bạn vừa chọn thêm sản phẩm vào danh sách");
                    iServiceProduct.addProduct();
                    break;
                case 2:
                    System.out.println("bạn vừa chọn chức năng sửa theo id");
                    iServiceProduct.fixProduct();
                    break;
                case 3:
                    System.out.println("bạn vừa chọn xóa sản phẩm theo id");
                    iServiceProduct.deletProduct();
                    break;
                case 4:
                    System.out.println("bạn vừa chọn hiển thị sản phẩm");
                    iServiceProduct.findAllProduct();

                    break;
                case 5:
                    System.out.println("bạn vừa chọn tìm kiếm sản phẩm theo tên");
                    iServiceProduct.SearchProductsByName();
                    break;
                case 6:
                    System.out.println("bạn vừa chọn sắp xếp sản phẩm theo giá tiền");
                    iServiceProduct.ProductArrangements();
                    break;

            }

        } while (choice >= 1 && choice <= 6);
    }


}
