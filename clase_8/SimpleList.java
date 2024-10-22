public class SimpleList {

    private char info = '\0';
    private SimpleList link = null;

    public SimpleList() {

    }

    public SimpleList(char v) {
        info = v;
        link = null;
    }

    public char getInfo() {
        return info;
    }

    public SimpleList getLink() {
        return link;
    }

    public SimpleList insert(char v) {
        SimpleList node = new SimpleList(v);
        node.link = this;
        return node;
    }

    public void display(String message) {
        System.out.println("Imprimiendo...");
        System.out.println(message);
        SimpleList node = this;
        for (int i = 0; node != null; i++) {
            System.out.println(i + ": " + node.info);
        }
    }
}
