package HomeWork09;

import java.util.Collection;



public class LinkedCollection implements CustomCollection<String> {

    private Link first;
    private Link last;

    public LinkedCollection() {
        first = null;
        last = null;
    }

    @Override
    public boolean add(String str) {
        Link newLink = new Link(str);
        if(isEmpty()) first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
       for (Object str : strColl) {
        Link newLink = new Link((str!=null)?str.toString():null);
        if (isEmpty()) first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
        return true;
    }
    @Override
    public boolean delete(int index) {
        Link current = first;
        for (int i = 0; i<index; i++)
        {
            current = current.next;
            if(current == null)
                return false;
        }
        if(current==first) first = current.next;
        else current.previous.next = current.next;
        if(current==last) last = current.previous;
        else current.next.previous = current.previous;
        return true;
    }

    @Override
    public boolean delete(String str) {
            Link current = first;
            while(current.sData != str) {
                current = current.next;
                if(current == null)
                    return false;
            }
            if(current==first) first = current.next;
            else current.previous.next = current.next;
            if(current==last) last = current.previous;
            else current.next.previous = current.previous;
            return true;
    }

    @Override
    public String get(int index) {
        Link current = first;
        for (int i = 0; i<index; i++)
        {
            current = current.next;
        }
        return current.sData;
    }

    @Override
    public boolean contains(String str) {
        Link current = first;
        while(current.sData != str) {
            current = current.next;
            if(current == null)
                return false;
        }
        return true;
    }

    @Override
    public boolean clear() {
        Link current = first;
        while(current != null) {
            current = current.next;
            first = null;
        }
        System.out.println("CLEAR");
        return true;
    }

    @Override
    public int size() {
        int count = 0;
        Link current = first;
        while(current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    @Override
    public boolean trim() {
        return false;
    }

    public void print() {
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    private boolean isEmpty()
    { return first==null; }

}
