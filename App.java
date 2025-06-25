import Coffe.Coffe;
import CoffeOrder.CoffeOrder;
import CoffeTypeFactory.CoffeFactory;

public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando pedidos...\n");

        CoffeOrder order1 = new CoffeOrder("Espresso", "Grande", 1);
        CoffeOrder order2 = new CoffeOrder("Espresso", "Pequeno", 2);
        CoffeOrder order3 = new CoffeOrder("Latte", "Médio", 0);
        CoffeOrder order4 = new CoffeOrder("Espresso", "Médio", 1);
        CoffeOrder order5 = new CoffeOrder("Latte", "Grande", 3);

        order1.servir();
        order2.servir();
        order3.servir();
        order4.servir();
        order5.servir();

        System.out.println("\nTotal de tipos de café criados: " + CoffeTypeFactory.CoffeFactory.getTotalCreated());

        Coffe c1 = CoffeFactory.getCoffeType("Espresso");
        Coffe c2 = CoffeFactory.getCoffeType("Espresso");
        Coffe c3 = CoffeFactory.getCoffeType("latte");

        System.out.println("c1 == c2? " + (c1 == c2)); 
        System.out.println("c1 == c3? " + (c1 == c3)); 
    }
}
