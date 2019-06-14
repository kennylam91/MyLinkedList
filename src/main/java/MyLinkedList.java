public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int nodeNumbers = 0;

    MyLinkedList(Object data) {
        head = new Node(data);
    }

    MyLinkedList() {
        head = null;
        tail = null;
    }

    private class Node<E> {
        private E data;
        private Node next;

        Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int getNodeNumbers() {
        return nodeNumbers;
    }

    public void setNodeNumbers(int nodeNumbers) {
        this.nodeNumbers = nodeNumbers;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null)
            tail = head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }

        nodeNumbers++;


    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null)
            tail = head = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }

        nodeNumbers++;

    }

    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= nodeNumbers) addLast(e);
        else {
            Node<E> tempNode = head;
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.next;
            }
            Node<E> insertedNode = tempNode.next;
            Node<E> newNode = new Node<>(e);
            tempNode.next = newNode;
            newNode.next = insertedNode;
            nodeNumbers++;

        }

    }

    public void printList() {
        Node<E> tempNode = head;
        for (int i = 0; i < nodeNumbers; i++) {
            System.out.println(tempNode.getData());
            if (tempNode.next != null)
                tempNode = tempNode.next;
        }
    }

    public E removeFirst() {
        if (nodeNumbers == 0) {
            return null;
        } else {
            Node<E> tempNode = head;
            head = tempNode.next;
            nodeNumbers--;
            return tempNode.getData();
        }
    }

    public E removeLast() {
        if (nodeNumbers == 0) {
            return null;
        } else if (nodeNumbers == 1) {
            Node<E> tempNode = tail;
            head = tail = null;
            nodeNumbers--;
            return tempNode.getData();
        } else {
            Node<E> tempNode = head;
            for (int i = 0; i < nodeNumbers - 2; i++) {
                tempNode = tempNode.next;
            }
            Node<E> removeNode = tail;
            tail = tempNode;
            tempNode.next = null;
            nodeNumbers--;
            return removeNode.getData();


        }
    }

    public E remove(int index) {
        if (index < 0||index>=nodeNumbers) return null;
        else if(index==0) return removeFirst();
        else {
            Node<E> tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            Node<E> removeNode = tempNode.next;
            tempNode.next = removeNode.next;
            nodeNumbers--;
            return removeNode.getData();
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + this.head.getData() +
                ", tail=" + this.tail.getData() +
                ", nodeNumbers=" + this.nodeNumbers +
                '}';
    }
}
