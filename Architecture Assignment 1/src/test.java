import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors

public class test {
    public static void main(String[] args){
        // Get the file that contains the fruits and their respective prices
        File priceFile = new File(System.getProperty("user.dir") + "\\src\\ProductPriceData.txt");

        // create factory for the produce
        AbstractFactory abstractFactory = FactoryProducer.getFactory("PRODUCE");

        // Create 3 different kinds of fruit, and specify how much of each
        Produce apple = abstractFactory.create("APPLE", 3.5);
        Produce banana = abstractFactory.create("BANANA", 19.4);
        Produce mango = abstractFactory.create("MANGO", 40.4);

        // change their prices according to the data file
        try {
            Scanner myReader = new Scanner(priceFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.contains(apple.produceType())){
                    String fruitPrice = data.substring(data.lastIndexOf(":") + 1);
                    apple.setPrice(Double.parseDouble(fruitPrice));
                }
                if(data.contains(banana.produceType())){
                    String fruitPrice = data.substring(data.lastIndexOf(":") + 1);
                    banana.setPrice(Double.parseDouble(fruitPrice));
                }
                if(data.contains(mango.produceType())){
                    String fruitPrice = data.substring(data.lastIndexOf(":") + 1);
                    mango.setPrice(Double.parseDouble(fruitPrice));
                }
            }
        } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        // print out the prices of the fruit after changing
        // them according to the file.
        banana.printPrice();
        apple.printPrice();
        mango.printPrice();

    }
}
