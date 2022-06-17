package HomeWork08;

public class Run {
    public static void main(String[] args) {
        SimpleCollect sc = new SimpleCollect();
        sc.add("123");
        sc.add(8,"546");
        sc.add("456");
        sc.print();
        System.out.println();
        sc.delete("123");
        sc.print();
        System.out.println();
        System.out.println(sc.get(1));
        sc.add(6,"989");
        sc.print();
        System.out.println();
        System.out.println(sc.size() + "  " + sc.contain("456"));
    }

}
