public class Main {
    public static void main(String[] args) {
        LinkedList linked = new LinkedList();
        linked.insert(0);
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.remove(3);

        LinkedList words = new LinkedList();
        words.insert("a");
        words.insert("b");
        words.insert("z");
        words.insert("d");
        words.remove("b");
    }
}
