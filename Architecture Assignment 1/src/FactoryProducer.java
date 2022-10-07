public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("PRODUCE")) {
            return new GroceryProductFactory() {
            };
        }
        return null;
    }
}

