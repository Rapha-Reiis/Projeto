package Coffe;

public class Coffe {
    private final String name;
    private final String description;
    private final double basePrice;
    private final boolean containsMilk;

    public Coffe(String name, String description, double basePrice, boolean containsMilk) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.containsMilk = containsMilk;
    }

    public void serve(String size, int sugar) {
        System.out.println("\n Serving " + name + 
            "| Descrição: " + description + "), Tamanho: " + size +
            ", Açucar: " + sugar + " spoon(s)" +
            ", Preço base: $" + basePrice +
            ", contains milk: " + (containsMilk ? "Yes" : "No\n" ));
    }
}
