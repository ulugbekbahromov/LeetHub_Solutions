class MyLinkedList {
    
    class Node {
        int val;
        Node next;
        Node prev;
        Node (int val) {
            this.val = val;
        }
    }
    
    Node head;
    Node tail;
    int size;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        
        Node newNode = new Node(val);
        newNode.next = curr.next;
        newNode.next.prev = newNode;
        
        curr.next = newNode;
        newNode.prev = curr;
        size++;
    }
    
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        // delete curr;
        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
        size--;
    }
}