package ss012_java_collection.exercise.service;

import ss012_java_collection.exercise.model.Product;
import ss012_java_collection.exercise.repository.IRepositoryProduct;
import ss012_java_collection.exercise.repository.RepositoryProduct;
import ss012_java_collection.pratice.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct {
    IRepositoryProduct iRepositoryProduct = new RepositoryProduct();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> arrayList = new ArrayList<>();


    @Override
    public void addProduct() {
        Product product = new Product();
        int choice = 0;
        boolean check = false;
        String str1;
        String str2;

        do {
            System.out.println("đây là danh sách bạn nên chọn để thêm nếu để trống mặc định là null : ");
            System.out.println("=======================");
            System.out.println("1.thêm id");
            System.out.println("2.thêm tên");
            System.out.println("3.thêm giá");
            System.out.println("4.thêm thông tin sản phẩm");
            System.out.println("bấm một kí tự bất kì để thoát khỏi danh sách");
            System.out.println("=======================");
            System.out.println("mời bạn chọn chức năng của mình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("bạn đã chọn thêm id");
                    int idOfProduct;
                    idOfProduct = Integer.parseInt(scanner.nextLine());
                    product.setIdOfProduct(idOfProduct);


                    break;
                case 2:
                    System.out.println("bạn đã chọn thêm tên");
                    String nameOfProduct = scanner.nextLine();
                    product.setNameOfProduct(nameOfProduct);
                    break;
                case 3:
                    System.out.println("bạn đã chọn thêm giá");
                    double salaryOfProduct = Double.parseDouble(scanner.nextLine());
                    product.setSalaryOfProduct(salaryOfProduct);
                    break;

                case 4:
                    System.out.println("bạn đã giới thiệu sản phẩm");
                    int choiceOfAdd;
                    do {
                        System.out.println("=====================");
                        System.out.println("danh sách giới thiệu sản phẩm gồm có");
                        System.out.println("1.giới thiệu màu sắc");
                        System.out.println("2.Hạn sử dụng của Sản phẩm ");
                        System.out.println("bấm một số bất kì để thoát");
                        System.out.println("=====================");
                        System.out.println("mời bạn chọn chức năng giới thiệu");
                        choiceOfAdd = Integer.parseInt(scanner.nextLine());
                        switch (choiceOfAdd) {
                            case 1:
                                System.out.println("bạn đã chọn giới thiệu màu sắc");
                                System.out.println("mời bạn nhập màu sắc cần giới thiệu sản phẩm : ");
                                String colorOfProduct = scanner.nextLine();
                                str1 = colorOfProduct;

                                product.setProductExpiry(str1);
                                break;
                            case 2:
                                System.out.println("bạn đã chọn hạn sử dụng của sản phẩm");
                                System.out.println("mời bạn nhập ngày/tháng/năm khi bạn đã mua sản phẩm");
                                String expiryOfProduct = scanner.nextLine();
                                String[] splitOfProduct = expiryOfProduct.split("/");
                                int expiryOfProductNum = 2;
                                if (splitOfProduct.length == 3) {
                                    int ngayOfProduct = Integer.parseInt(splitOfProduct[0]);
                                    int thangOfProduct = Integer.parseInt(splitOfProduct[1]);
                                    int namOfProduct = Integer.parseInt(splitOfProduct[2]);
                                    namOfProduct += expiryOfProductNum;
                                    String str = ngayOfProduct + "/" + thangOfProduct + "/" + namOfProduct;
                                    System.out.println("hạn sử dụng bạn đã được tính ");
                                    str2 = str;
                                    product.setProductExpiry(str2);
                                }
                                break;


                        }
                    } while (choiceOfAdd >= 1 && choiceOfAdd <= 2);
            }
        } while (choice <= 4 && choice >= 1);
        iRepositoryProduct.addProduct(product);

    }

    @Override
    public void fixProduct() {
        System.out.println("mời bạn nhập id cần muốn sửa");
        int idOfProduct = Integer.parseInt(scanner.nextLine());
        ArrayList<Product> productArrayList = iRepositoryProduct.findAllProduct();
        int choiceOfProduct;
        boolean check = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (idOfProduct == productArrayList.get(i).getIdOfProduct()) {
                System.out.println("id bạn đã nhập chính xác");
                do {
                    System.out.println("Đây là menu sửa thông tin theo Id");
                    System.out.println("============================");
                    System.out.println("1.Bạn đã chọn sửa id");
                    System.out.println("2.Bạn đã chọn sửa tên");
                    System.out.println("3.Bạn đã chon sửa giá tiền");
                    System.out.println("4.Bạn đã chọn sửa thông tin giới thiệu");
                    System.out.println("5.để thoát");
                    System.out.println("============================");
                    System.out.println("Mời bạn chọn bạn cần muốn sửa");
                    choiceOfProduct = Integer.parseInt(scanner.nextLine());
                    switch (choiceOfProduct) {
                        case 1:
                            System.out.println("Bạn đã chọn sửa id");
                            System.out.println("đây là id cũ của bạn");
                            System.out.println(productArrayList.get(i).getIdOfProduct());
                            System.out.println("mời bạn nhập lại id mới của mình ");
                            int idNewProduct = Integer.parseInt(scanner.nextLine());
                            productArrayList.get(i).setIdOfProduct(idNewProduct);
                            System.out.println("id của bạn đã được sửa và đây là id mới của bạn");
                            System.out.println(idNewProduct);
                            check = true;
                            break;
                        case 2:
                            System.out.println("Bạn đã chọn sửa theo tên");
                            System.out.println("Đây là tên cũ của bạn");
                            System.out.println(productArrayList.get(i).getNameOfProduct());
                            System.out.println("mời bạn nhập lại tên mới của mình ");
                            String nameNewProduct = scanner.nextLine();
                            productArrayList.get(i).setNameOfProduct(nameNewProduct);
                            System.out.println("Tên của bạn đã được sửa và đây là tên mới của bạn");
                            System.out.println(nameNewProduct);
                            check = true;
                            break;
                        case 3:
                            System.out.println("Bạn đã chọn sửa theo giá tiền");
                            System.out.println("Đây là giá tiền cũ của bạn");
                            System.out.println(productArrayList.get(i).getSalaryOfProduct());
                            System.out.println("Mời bạn nhập giá tiền mới của mình");
                            double salaryNewProduct = Double.parseDouble(scanner.nextLine());
                            productArrayList.get(i).setSalaryOfProduct(salaryNewProduct);
                            System.out.println("giá tiền mới của bạn đã được sửa và đây là giá tiền bạn  thay dổi");
                            System.out.println(salaryNewProduct);
                            check = true;
                            break;
                        case 4:
                            System.out.println("Bạn đã chọn sửa thông tin giới thiệu");

                            check = true;
                            boolean checkNew = false;
                            int choiceNewInduction;
                            do {
                                System.out.println("có 2 phần giới thiệu của sản phẩm bạn cần thay đổi");
                                System.out.println("===================================================");
                                System.out.println("1.sủa màu");
                                System.out.println("2.sửa hạn sử dụng");
                                System.out.println("3.bấm số khác để thoát khỏi vòng lập");
                                System.out.println("===================================================");
                                System.out.println("mời bạn bấm số 1 để vào vòng lập(bắt buộc) ");
                                choiceNewInduction = Integer.parseInt(scanner.nextLine());
                                boolean checkNewProductionOfProduct = false;
                                switch (choiceNewInduction) {
                                    case 1:
                                        checkNew = true;
                                        int choiceOfNewProduction;

                                        System.out.println("bạn đã chọn sửa màu");
                                        System.out.println("Đây là chuỗi đã có trong mảng");
                                        System.out.println(
                                                productArrayList.get(i).getProductExpiry()
                                        );
                                        do {
                                            System.out.println("===========");
                                            System.out.println("1.Nếu nó là màu");
                                            System.out.println("2.Nếu nó là ngày/tháng/năm");
                                            System.out.println("===========");
                                            choiceOfNewProduction = Integer.parseInt(scanner.nextLine());
                                            if (choiceOfNewProduction == 1) {
                                                checkNewProductionOfProduct = true;
                                                System.out.println("nó là màu");
                                                String colorNewIntroduction = scanner.nextLine();
                                                productArrayList.get(i).setProductExpiry(colorNewIntroduction);
                                                System.out.println(productArrayList.get(i).getProductExpiry());
                                            }
                                            if (choiceOfProduct == 2) {
                                                checkNewProductionOfProduct = true;
                                                System.out.println("nó là số");
                                                String[] splitOfNewProduction = productArrayList.get(i).getProductExpiry().split("/");
                                                int ngay = Integer.parseInt(splitOfNewProduction[0]);
                                                int thang = Integer.parseInt(splitOfNewProduction[1]);
                                                int nam = Integer.parseInt(splitOfNewProduction[2]);
                                                System.out.println(ngay + "/" + thang + "/" + nam);
                                                System.out.println("đó là hạn sử dụng cũ của nó");
                                                System.out.println("mời bạn nhập mới đúng theo form ngày /tháng /năm . ");
                                                String newChoice = scanner.nextLine();
                                                String[] newMyChoice = newChoice.split("/");
                                                int newNgay = Integer.parseInt(newMyChoice[0]);
                                                int newThang = Integer.parseInt(newMyChoice[1]);
                                                int newNam = Integer.parseInt(newMyChoice[2]);
                                                int totalProduct = 2;
                                                newNam += totalProduct;
                                                String str = newNgay + "/" + newThang + "/" + newNam;
                                                productArrayList.get(i).setProductExpiry(str);
                                                System.out.println("chuỗi mới của bạn đã được tính và sửa");
                                                System.out.println("đây là chuỗi mới của bạn" + str);

                                            }


                                        } while (!checkNewProductionOfProduct);
                                        break;

                                    default:
                                        System.out.println("bạn không nhập đúng số 1");
                                        checkNew = false;
                                        break;
                                }
                            } while (checkNew);
                        case 5:
                            check = false;
                    }


                } while (check);
            }

        }


    }

    @Override
    public void deletProduct() {
        System.out.println("mời bạn nhập id cần muốn xóa");
        int idNeedDelet = Integer.parseInt(scanner.nextLine());
        iRepositoryProduct.deletProduct(idNeedDelet);


    }

    @Override
    public ArrayList<Product> findAllProduct() {
        for (Product product : iRepositoryProduct.findAllProduct()

        ) {
            System.out.println(product);

        }
        return iRepositoryProduct.findAllProduct();
    }

    @Override
    public void SearchProductsByName() {
        System.out.println("mời bạn nhập tên bạn cần tìm sản phẩm");
        String nameOfProduct = scanner.nextLine();
        System.out.println("Đây là tên sản phẩm bạn cần kiếm tìm");
        iRepositoryProduct.SearchProductsByName(nameOfProduct);

    }

    @Override
    public void ProductArrangements() {
        System.out.println("đây là danh sách sắp xếp");
        System.out.println("======================================");
        System.out.println("1. chọn (1) sắp xếp tăng dần theo giá tiền");
        System.out.println("2.chọn (2) sắp xếp giảm dần theo giá");
        int choice = Integer.parseInt(scanner.nextLine());
        iRepositoryProduct.ProductArrangements(choice);
        System.out.println("======================================");

    }
}
