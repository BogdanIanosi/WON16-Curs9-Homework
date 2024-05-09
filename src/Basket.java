import java.util.ArrayList;
import java.util.Collection;

public class Basket {
    private ArrayList<String> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new ArrayList<>(fruits);
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int count = 0;
        for (String fruit : fruits) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Apple");
        basket.add("Banana");
        basket.add("Apple");
        basket.add("Orange");

        System.out.println("Is Banana in the basket? " + basket.find("Banana"));
        System.out.println("Removing Banana: " + basket.remove("Banana"));
        System.out.println("Is Banana in the basket now? " + basket.find("Banana"));

        System.out.println("Position of Orange: " + basket.position("Orange"));

        System.out.println("Distinct fruits in the basket: " + basket.distinct());

        System.out.println("Number of fruits in the basket: " + basket.count());

        System.out.println("Custom count of fruits in the basket: " + basket.customCount());
    }
}
