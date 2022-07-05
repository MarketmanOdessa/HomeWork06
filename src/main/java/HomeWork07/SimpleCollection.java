package HomeWork07;

import java.util.Arrays;

public class SimpleCollection implements SimpleFive {
    private String[] arr;
    private int size = 0;
    public SimpleCollection(){
        arr = new String[]{"1","2","3","4","5"};
    }

    public static void main(String[] args) {
        new SimpleCollection().run();
    }
    @Override
    public boolean add(int index, String value) {
        try {
            String[] result = new String[arr.length];
            for (int i = 0; i < index; i++)
                result[i] = arr[i];
            result[index] = value;
            for (int i = index + 1; i < arr.length; i++)
                result[i] = arr[i - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = result[i];
            }
            return true;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public boolean add(String value) {
        String[] temp = arr;
        arr = new String[temp.length+1];
        System.arraycopy(temp,0,arr,0,temp.length);
        arr[arr.length-1] = value;
        return true;
    }
    @Override
    public boolean delete(int index) {
        arr[index] = null;
        return true;
        }
    @Override
    public boolean delete(String value) {
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s == value) {
                arr[i] = null;
            }
        }
        return true;
    }
    @Override
    public String get(int index) {
        return arr[index];
    }
    private void run() {
        add("1");
        add("2");
        add("3");
        add("4");
        System.out.println(get(2));
        add(2, "string");
        delete(2);
        delete("5");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }

