public class Banana implements Produce {
    //setting/declaring variables that this fruit needs
    double weightInLbs;
    double unitPrice;
    double price;
    String color = "yellow";

    //This is the constructor for Banana
    public Banana (double weightInLbs){
        this.weightInLbs = weightInLbs;
    }

    //sets the unit price of the banana
    public void setPrice(double unitPrice){
        this.unitPrice = unitPrice;
        price = unitPrice*weightInLbs;
    }

    //returns the current price of the banana
    public double getPrice(){
        return this.unitPrice;
    }

    //Prints the current price and unit price of the banana
    public void printPrice(){
        System.out.println("The Bananas current price is $" + price + "\n with a unit price of $" + unitPrice + "\n");
    }

    //returns a string literal of the fruits type
    public String produceType(){
        return "Banana";
    }

}
