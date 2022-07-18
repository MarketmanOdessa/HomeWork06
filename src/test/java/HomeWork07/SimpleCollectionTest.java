package HomeWork07;

class SimpleCollectionTest {

    @org.junit.jupiter.api.Test
    void add() {
        SimpleCollection sc = new SimpleCollection();
        sc.add(1,"1");
        assert sc.get(1).equals("1");
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        SimpleCollection sc = new SimpleCollection();
        sc.add("Zero");
        sc.add("One");
        sc.add("Two");
        assert sc.get(7).equals("Two");
    }

    @org.junit.jupiter.api.Test
    void delete() {
        SimpleCollection sc = new SimpleCollection();
        sc.delete(1);
        assert sc.get(1) == null;
    }

    @org.junit.jupiter.api.Test
    void testDelete() {
        SimpleCollection sc = new SimpleCollection();
        sc.delete("2");
        assert sc.get(1) == null;
    }

    @org.junit.jupiter.api.Test
    void get() {
        SimpleCollection sc = new SimpleCollection();
        sc.add("Zero");
        String s = sc.get(5);
       assert s.equals("Zero");
    }
}