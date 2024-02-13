
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
        myLinkedList.printList();
        myLinkedList.get(0);
        System.out.println("\nValue of index 0: " + myLinkedList.get(0).value);

        System.out.println("Removed: " + myLinkedList.removeLast().value);
        System.out.println("Removed: " + myLinkedList.removeFirst().value);

        myLinkedList.printList();
        System.out.println("\nValue of index 0: " + myLinkedList.get(0).value);

        // Note that if the LinkedList is left empty after removing an item
        // Printing it with .value at the end will cause an error.
        // if omitted then it will work correctly and print

    }
}
