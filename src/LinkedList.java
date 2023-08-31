public class LinkedList <E extends Comparable>{
    private class ListNode<E> {
        public E value;
        public ListNode<E> next;

        public ListNode() {
        }

        public ListNode(E o) {
            this.value = o;
        }
    }
    private ListNode<E> head = new ListNode<>();
    private ListNode<E> tail;
    private int size;

    public LinkedList() {
        this.size = 0;
        tail = head;
    }

    public int getSize() {return this.size;}
    public boolean isEmpty() {return this.size == 0;}

    public void insert(E o) {
        ListNode<E> node = new ListNode<>(o);
        ListNode<E> current = head.next;
        ListNode<E> previous = head;

        while(current != null && current.value.compareTo(o)< 0) {
            previous = current;
            current = current.next;
        }

        previous.next = node;
        node.next = current;
        if (current == null) {
            tail = node;
        }

        this.size++;
    }

    public void remove(E o){
        ListNode<E> node = head.next;
        ListNode<E> previous = head;

        while (node.value.compareTo(o) != 0) {
            previous = node;
            node = node.next;
        }

        previous.next = node.next;
        if (previous.next == null) {
            tail = previous;
        }
        this.size--;
    }

    public void print(){
        ListNode<E> node = head.next;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

}


