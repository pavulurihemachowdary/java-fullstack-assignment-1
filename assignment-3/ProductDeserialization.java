import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ProductDeserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Product product = (Product) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Product:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
