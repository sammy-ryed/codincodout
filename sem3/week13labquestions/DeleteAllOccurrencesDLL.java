class DeleteAllOccurrencesDLL {
    Node head;

    class Node {
        int data;
        Node prev, next;
        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteAll(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" ⇄ ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteAllOccurrencesDLL list = new DeleteAllOccurrencesDLL();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(20);
        list.append(40);
        System.out.print("Original List: ");
        list.display();
        list.deleteAll(20);
        System.out.print("After Deletion: ");
        list.display();
    }
}
