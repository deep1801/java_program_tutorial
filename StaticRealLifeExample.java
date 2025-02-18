class Hondacity {
    static long price = 10; // Static variable shared by all instances
    int a, b; // Instance variables

    // Static method to calculate OnRoadPrice
    static double OnRoadPrice(String city) {
        switch (city) {
            case "delhi":
                return price + price * 0.1;

            case "mumbai":
                return price + price * 0.09;

            default:
                // Return a default value if the city is not listed
                return price;
        }
    }
}

public class StaticRealLifeExample {
    public static void main(String[] args) {
        Hondacity h1 = new Hondacity();
        Hondacity h2 = new Hondacity();

        // Call the static method and print results
        System.out.println("On Road Price in Delhi: " + Hondacity.OnRoadPrice("delhi"));
        System.out.println("On Road Price in Mumbai: " + Hondacity.OnRoadPrice("mumbai"));
        System.out.println("On Road Price in Other City: " + Hondacity.OnRoadPrice("bangalore"));
    }
}
