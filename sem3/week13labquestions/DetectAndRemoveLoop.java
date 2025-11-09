class DetectAndRemoveLoop {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void createLoop(int position) {
        if (position <= 0) return;
        Node loopNode = head, end = head;
        for (int x = 1; loopNode != null && x < position; x++) loopNode = loopNode.next;
        while (end.next != null) end = end.next;
        end.next = loopNode;
    }

    public boolean detectAndRemoveLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                removeLoop(slow);
                return true;
            }
        }
        return false;
    }

    private void removeLoop(Node loopNode) {
        Node ptr1 = head;
        while (true) {
            Node ptr2 = loopNode;
            while (ptr2.next != loopNode && ptr2.next != ptr1)
                ptr2 = ptr2.next;
            if (ptr2.next == ptr1) break;
            ptr1 = ptr1.next;
        }
        ptr1.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
        list.add(10); list.add(20); list.add(30); list.add(40); list.add(50);
        list.createLoop(3);
        if (list.detectAndRemoveLoop()) System.out.println("Loop detected and removed.");
        else System.out.println("No loop found.");
        System.out.println("List after removal:");
        list.display();
    }
}
