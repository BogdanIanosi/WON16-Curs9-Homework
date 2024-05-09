import java.util.*;

public class FlowerBouquet {
    private Set<String> flowers;

    public FlowerBouquet() {
        flowers = new HashSet<>();
    }

    public Collection<String> getAll() {
        return flowers;
    }

    public void add(String flower) {
        flowers.add(flower);
    }

    public void remove(String flower) {
        flowers.remove(flower);
    }

    public static void main(String[] args) {
        FlowerBouquet bouquet = new FlowerBouquet();
        bouquet.add("Rose");
        bouquet.add("Lily");
        bouquet.add("Tulip");
        bouquet.add("Daisy");

        System.out.println("All flowers: " + bouquet.getAll());

        bouquet.remove("Lily");

        System.out.println("All flowers after removing Lily: " + bouquet.getAll());
    }
}

