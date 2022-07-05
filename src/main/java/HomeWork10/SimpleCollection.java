package HomeWork10;

import HomeWork08.Collection;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class SimpleCollection implements Collection, Iterator {

    private int arrSize = 10;
    private int count = 0;
    private int currentIndex = 0;
    private String[] arr = new String[arrSize];

    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public boolean add(String o) {
        if(count == arr.length-1) resize(arr.length*2);
        arr[count++] = o;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        try {
            String[] result = new String[arr.length];
            for (int i = 0; i < index; i++)
                result[i] = arr[i];
            result[index] = o;
            for (int i = index + 1; i < arr.length; i++)
                result[i] = arr[i - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = result[i];
            }
            count++;
            return true;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(o)) {
                String[] newArr = new String[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                arr = newArr;
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        return arr[index];
    }

    @Override
    public boolean contain(String o) {
        for (String s : arr) {
            if (o.equals((String)s)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (str.equals(arr)) return true;
        else return false;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < count; i++)
            arr[i] = null;
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }
    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(arr, 0, newArray, 0, count);
        arr = newArray;
    }

    @Override
    public boolean hasNext() {
       return currentIndex < arr.length;
    }

    @Override
    public String next() {
        return arr[currentIndex++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }


}
