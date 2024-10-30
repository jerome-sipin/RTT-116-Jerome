package Classwork_InClassExamples.coffee_shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductLoader {

    public List<Product> loadProducts(){
        List<Product> result = new ArrayList<>();

        // will read the products from the file and return a list of products from the data

        try {
            // 1) open the file to read from
            File file = new File("src/products.txt");

            // 2) read the file line by line to get our products
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ( ( line = br.readLine() ) != null) {
                String[] tokens = line.split(",");

                Product p = new Product();
                p.setName(tokens[0]);
                p.setPrice(Double.parseDouble(tokens[1]));
                result.add(p);

                System.out.println(p);

            }


        } catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        new ProductLoader().loadProducts();

    }
}