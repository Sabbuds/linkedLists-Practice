public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // LinkedLists's methods very often (if not always) create a Node.
    // In order to not mindlessly repeat code we should create a class that does
    // only that

    // The following class's only purpose is to create said Nodes

    class Node {
        int value; // This is the Node's value
        Node next; // This is the pointer

        Node(int value) {
            this.value = value; // this.value refers to the class's attribute while the other value refers to
                                // the argument.
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value); // right of = creates a node.
                                        // left of = assigns a variable which points to said node.
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
