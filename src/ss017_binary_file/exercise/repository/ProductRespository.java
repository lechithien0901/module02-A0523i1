package ss017_binary_file.exercise.repository;

import ss017_binary_file.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRespository implements IProductRespository {
    static final String FILE_PRODUCT = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss017_binary_file\\fileproduct";


    public List<Product> reaProduct() throws FileNotFoundException, IOException, Exception {
        File file = new File(FILE_PRODUCT);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> list = new ArrayList<>();
        list = (List<Product>) objectInputStream.readObject();
        return list;

    }

    public void writeProduct(List<Product> products) throws FileNotFoundException, IOException, Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PRODUCT);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(products);
    }


    static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "CD09", "nguyen van a", "màu vàng", 3000));
        productArrayList.add(new Product(2, "CD010", "nguyen van b", "màu đỏ", 7000));
        productArrayList.add(new Product(3, "CD011", "nguyen van c", "màu xám", 5000));
        productArrayList.add(new Product(4, "CD012", "nguyen van d", "màu tím", 9000));
    }

    @Override
    public void addProduct(Product product) {
        try {
            productArrayList.add(product);
            ProductRespository productRespository = new ProductRespository();
            productRespository.writeProduct(productArrayList);

        } catch (FileNotFoundException e) {
            System.out.println("file không tìm thấy");
        } catch (IOException e) {
            System.out.println("file không thể truy cập được");
        } catch (Exception e) {
            System.out.println("chương trình đang bị lỗi gì đó");
        }

    }

    @Override
    public List<Product> showProduct() {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ProductRespository productRespository = new ProductRespository();
            productRespository.writeProduct(productArrayList);
            arrayList = (ArrayList<Product>) productRespository.reaProduct();
        } catch (FileNotFoundException e) {
            System.out.println("file không tìm thấy");
        } catch (IOException e) {
            System.out.println("file không thể truy cập được");
        } catch (Exception e) {
            System.out.println("chương trình đang bị lỗi gì đó");
        }
        return arrayList;
    }

    @Override
    public void findProduct(String name) {
        boolean check=false;
        try{
            ProductRespository productRespository=new ProductRespository();
            productRespository.writeProduct(productArrayList);
            ArrayList<Product>arrayList=new ArrayList<>();
            arrayList=(ArrayList<Product>) productRespository.reaProduct();
            for (int i = 0; i < arrayList.size(); i++) {
                if (name.equals(arrayList.get(i).getProductName())){
                    System.out.println("có sản phẩm bạn đang tìm kiếm");
                    System.out.println(arrayList.get(i));
                    check=true;
                }

            }
        }catch (FileNotFoundException e){
            System.out.println("File của bạn không thể tìm thấy");
        }catch (IOException e){
            System.out.println("File không thể truy cập");
        }catch (Exception e){
            System.out.println("bạn bị lỗi một gì đó ");
        }

        if (!check){
            System.out.println("sản phẩm bạn tìm không có trong danh sách");
        }
    }
}
