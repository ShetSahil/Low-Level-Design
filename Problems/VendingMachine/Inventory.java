package Problems.VendingMachine;
import java.util.*;

public class Inventory {
    HashMap<String,Product> productTypes;
    HashMap<Product,Integer> products;

    public Inventory(){
        products= new HashMap<>();
        productTypes= new HashMap<>();
    }


    public void addProductInInventory(Product product){
        productTypes.put(product.name , product);
    }

    public void addProductQuantity(Product product , int quantity){
        products.put(product,products.getOrDefault(product,0)+quantity);
    }

    public void allProducts(){
        System.out.println("We have products : ");
        for(String item : productTypes.keySet()){
            System.out.println(item);
        }
    }

    public boolean productAvailable(String name){
        Product product = productTypes.get(name);
        if(product==null){
            return false;
        }
        return products.get(product)>=1?true:false;

    }

    public boolean amountPayable(String name ,int amount){
        Product product = productTypes.get(name);
        return product.getPrice()<=amount;

    }

    public void getProduct(String name){
        Product product= productTypes.get(name);
        products.put(product,products.get(product)-1);
    }

    public int returnChange(String name , int amount){
        Product product = productTypes.get(name);
        if(product.getPrice()<amount){
            return amount-product.getPrice();
        }
        return 0;
    }

}
