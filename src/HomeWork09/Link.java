package HomeWork09;

public class Link {
    public String sData;
    public Link next;
    public Link previous;

    public Link(String dd) {
        sData = dd;
    }
    public void displayLink() {
        System.out.print(sData + " ");
    }
}

