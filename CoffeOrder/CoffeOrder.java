package CoffeOrder;

import Coffe.Coffe;
import CoffeTypeFactory.CoffeFactory;

public class CoffeOrder {
    private final Coffe coffe;
    private final String size;
    private final int sugar;
    
    public CoffeOrder(String type, String size, int sugar) {
        this.coffe = CoffeFactory.getCoffeType(type);
        this.size = size;
        this.sugar = sugar;
    }

    public void servir(){
        coffe.serve(size, sugar);
    }

    
}
