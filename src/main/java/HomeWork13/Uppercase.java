package HomeWork13;

import java.util.*;
import java.util.stream.Collectors;

public class Uppercase {
    public static void main(String[] args) {

        class Pair {
            public String x;
            public String y;
            public Pair(String x, String y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "Pair{" +
                        "x='" + x + '\'' +
                        ", y='" + y + '\'' +
                        '}';
            }
        }

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        List<Pair> pair = list
                .stream()
                .map(e -> new Pair(e, e.toUpperCase(Locale.ROOT)))
                .toList();

        pair.forEach(System.out::println);
    }
}