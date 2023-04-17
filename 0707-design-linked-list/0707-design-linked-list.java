class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node() {
        this.next = null;
    }
}

class MyLinkedList {
    int size;
    Node head;

    public MyLinkedList() {
        size = 0;
        head = new Node(-1);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node node = new Node(val);
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        
        if (index < 0 || index >= size) {
            return;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
}