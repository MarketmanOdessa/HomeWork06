package HomeWork07;


import org.junit.jupiter.api.Assertions;

class SimpleCollectionTest {

    @org.junit.jupiter.api.Test
    void add() {
        SimpleCollection sc = new SimpleCollection();
        boolean b = sc.add(1,"1");
        Assertions.assertTrue(equals(true,b));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void testDelete() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }
}