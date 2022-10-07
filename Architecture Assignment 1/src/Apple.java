public class Apple implements Produce {
    //setting/declaring variables that this fruit needs
    double weightInLbs;
    double unitPrice;
    double price;
    String color = "red";

    //This is the constructor for apple
    public Apple (double unitPrice){
        this.unitPrice = unitPrice;
    }
    //sets the unit price of the apple
    public void setPrice(double unitPrice){
        this.unitPrice = unitPrice;
        price = unitPrice*weightInLbs;
    }

    //Prints the unit price of the apple
    public void printPrice(){
        System.out.println("The Apples current price is $" + price + "\n with a unit price of $" + unitPrice + "\n");
    }
    //returns the unit price of the apple
    public double getPrice(){
        return this.unitPrice;
    }

    //returns a string literal of the fruits type
    public String produceType(){
        return "Apple";
    }
}
