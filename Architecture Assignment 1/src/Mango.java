public class Mango implements Produce{
    //setting/declaring variables that this fruit needs
    double weightInLbs;
    double unitPrice;
    double price;
    String color = "green red";

    //This is the constructor for mango
    public Mango (double weightInLbs){
        this.weightInLbs = weightInLbs;
    }

    //sets the unit price of the mango
    public void setPrice(double unitPrice){
        this.unitPrice = unitPrice;
        price = unitPrice*weightInLbs;
    }

    //Prints the current price and unit price of the mango
    public void printPrice(){
        System.out.println("The Mangoes current price is $" + price + "\n with a unit price of $" + unitPrice + "\n");
    }

    //returns the current price of the mango
    public double getPrice(){
        return this.unitPrice;
    }

    //returns a string literal of the fruits type
    public String produceType(){
        return "Mango";
    }
}
