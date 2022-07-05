package HomeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class LoverCase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("two");
        list.add("three");
        list.add("FouR");
        list.add("five");
        printLowerCase(list);
    }

    public static void printLowerCase(List<String> list) {
        Predicate<String> pre = p -> p.equals(p.toLowerCase(Locale.ROOT));
          list.stream()
                  .filter(pre)
                  .forEach(System.out::println);
        }
    }


