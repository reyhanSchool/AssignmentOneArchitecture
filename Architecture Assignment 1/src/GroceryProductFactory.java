public interface GroceryProductFactory extends AbstractFactory{

    public default Produce create(String produceType, double produceWeight){
        if(produceType.equalsIgnoreCase("APPLE")){
            return new Apple(produceWeight);
        }
        if(produceType.equalsIgnoreCase("BANANA")){
            return new Banana(produceWeight);
        }
        if(produceType.equalsIgnoreCase("MANGO")){
            return new Mango(produceWeight);
        }
        return null;
    }
}
