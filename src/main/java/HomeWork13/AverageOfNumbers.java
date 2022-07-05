package HomeWork13;

import java.util.ArrayList;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(8);
        list.add(15);
        list.add(39);
        list.add(162);
        System.out.println(calculateAverage(list));
    }
    public static double calculateAverage(List<Integer> x) {
        return x.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
