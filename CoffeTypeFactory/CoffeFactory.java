package CoffeTypeFactory;

import java.util.HashMap;
import java.util.Map;
import Coffe.Coffe;

public class CoffeFactory {
    private static final Map<String, Coffe> types = new HashMap<>();
    private static int totalCreated = 0;

    public static Coffe getCoffeType(String type) {

        if (!types.containsKey(type)) {
            System.out.println("Criando novo tipo de café: " + type);
            switch (type) {
                case "Espresso":
                    types.put(type, new Coffe("Espresso", "Café forte e concentrado", 5.00, false));
                    break;
                case "Cappuccino":
                    types.put(type, new Coffe("Cappuccino", "Café com leite e espuma", 6.50, true));
                    break;
                case "Latte":
                    types.put(type, new Coffe("Latte", "Café suave com bastante leite", 6.00, true));
                    break;
                default:
                    types.put(type, new Coffe(type, "Café personalizado", 7.00, false));
                    break;
            }
            totalCreated++;
        }
        return types.get(type);
    }

    public static int getTotalCreated() {
        return totalCreated;
    }
}
