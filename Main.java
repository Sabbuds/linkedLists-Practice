
public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);

        myLinkedList.append(3);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        System.out.println("");

        myLinkedList.prepend(1);

        System.out.println("Removed: " + myLinkedList.removeLast().value); // This code prints the removed node.
        System.out.println("Removed: " + myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast()); // Notice how there is no .value This is because it is null.

    }
}
