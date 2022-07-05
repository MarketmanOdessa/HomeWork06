package HomeWork09;

import java.util.ArrayList;

public class LinkedCollectionApp {
    public static void main(String[] args) {
        LinkedCollection lc = new LinkedCollection();
        lc.add("A");
        lc.add("B");
        lc.add("C");
        lc.add("D");
        lc.add("E");
        lc.add("F");
        lc.add("G");
        lc.print();
        lc.delete("C");
        lc.print();
        System.out.println(lc.contains("B"));
        System.out.println(lc.contains("K"));
        lc.delete(4);
        lc.print();
        lc.add("H");
        System.out.println(lc.get(3));
        lc.print();
        System.out.println(lc.size());
        lc.clear();
        lc.print();
        lc.add("H");
        lc.add("I");
        lc.add("J");
        lc.print();
        lc.delete(1);
        lc.print();
        ArrayList<String> newColl = new ArrayList<>();
        newColl.add("L");
        newColl.add("M");
        newColl.add("N");
        lc.addAll(newColl);
        lc.print();
        ArrayList<Integer> newIntColl = new ArrayList<>();
        newIntColl.add(1);
        newIntColl.add(2);
        newIntColl.add(3);
        newIntColl.add(null);
        lc.addAll(newIntColl);
        lc.print();
    }
}
