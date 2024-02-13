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
            System.out.print(temp.value + " ");
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

    // This method adds a number to the end of the Linked List.

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) { // In case the list is empty we want both pointers pointing to the new value.
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // This refers to the value being pointed at by the tail pointer
            tail = newNode; // This refers to the actual pointer.
        }
        length++;
    }

    public Node removeLast() {
        Node temp = head;
        Node pre = temp;

        if (length == 0 || head == null)
            return null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;

        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) { // This'll make both head and tail point to the new (only) node.
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head; // Makes new node point to where head pointer is currently pointing
            head = newNode; // Makes head pointer point to the newNode
        }
        length++;
    }

}
