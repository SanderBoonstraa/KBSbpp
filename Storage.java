import java.util.ArrayList;

public class Storage {
    private ArrayList<Product> products;

    public Storage(){
        products = new ArrayList<Product>();
    }

    public void addStorage(Product product){
        products.add(product);
    }

    public void getProducts(){
        for(Product product:products) {
            System.out.println(product.getHeight());
        }
    }
}
