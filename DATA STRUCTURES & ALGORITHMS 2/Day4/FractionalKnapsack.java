package DSA.Day4;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
 
    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}
class ItemComparator implements Comparator<Item> {
	 
    @Override
    public int compare(Item a, Item b) {
 
        double ratio1 = (double) a.value / a.weight;
        double ratio2 = (double) b.value / b.weight;
 
        // Sort in descending order of value/weight
        if (ratio1 < ratio2)
            return 1;
        else if (ratio1 > ratio2)
            return -1;
        else
            return 0;
    }
}
public class FractionalKnapsack {
 
    public static double fractionalKnapsack(int W, int[] values, int[] weights) {
 
        int n = values.length;
        Item[] items = new Item[n];
 
        // Step 1: Create items
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
 
//        // Step 2: Sort by value/weight ratio (descending)
//        Arrays.sort(items, (a, b) -> {
//            double r1 = (double) a.value / a.weight;
//            double r2 = (double) b.value / b.weight;
//            return Double.compare(r2, r1);
//        });
     // Step 2: Sort using custom comparator
        Arrays.sort(items, new ItemComparator());
 
        double totalValue = 0.0;
 
        // Step 3: Pick items greedily
        for (Item item : items) {
            if (W >= item.weight) {
                W -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * ((double) W / item.weight);
                break;
            }
        }
 
        return totalValue;
    }
 
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
 
        System.out.println(fractionalKnapsack(W, values, weights));
    }
}