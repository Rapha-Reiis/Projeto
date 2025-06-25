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
        System.out.println("Serving " + name +
            " (" + description + "), size: " + size +
            ", sugar: " + sugar + " spoon(s)" +
            ", base price: $" + basePrice +
            ", contains milk: " + (containsMilk ? "Yes" : "No"));
    }
}
