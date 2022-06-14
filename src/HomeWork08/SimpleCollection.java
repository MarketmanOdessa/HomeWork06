package HomeWork08;

public class SimpleCollection implements Collection {
    private String[] arr;
    private int size = 0;
    public SimpleCollection(){
        arr = new String[]{"1","2","3","4","5"};
    }

    public static void main(String[] args) {
        new HomeWork07.SimpleCollection().run();
    }


    @Override
    public boolean add(String o) {
        return false;
    }

    @Override
    public boolean add(int index, String o) {
        return false;
    }

    @Override
    public boolean delete(String o) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean contain(String o) {
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
