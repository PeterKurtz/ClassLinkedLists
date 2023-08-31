public class Main {
    public static void main(String[] args) {
        LinkedList linked = new LinkedList();
        linked.insert(0);
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.remove(3);
        linked.print();

        LinkedList words = new LinkedList();
        words.insert("a");
        words.print();
        words.insert("b");
        words.print();
        words.insert("z");
        words.print();
        words.insert("d");
        words.print();
        words.remove("b");
        words.print();
    }
}
