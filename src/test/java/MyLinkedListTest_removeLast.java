public class MyLinkedListTest_removeLast {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<String> myLinkedList= new MyLinkedList<>();
        myLinkedList.addLast("mot");
        myLinkedList.addLast("hai");
        myLinkedList.addLast("bon");
        myLinkedList.addFirst("khong");
        myLinkedList.add(3,"ba");
        myLinkedList.add(10,"nam");
        myLinkedList.add(10,"sau");
        System.out.println("remove element: "+myLinkedList.removeLast());
        myLinkedList.printList();

        MyLinkedList<String> myLinkedList1= new MyLinkedList<>();
        myLinkedList1.addLast("mot");
        System.out.println("removed element: "+myLinkedList1.removeLast());
        myLinkedList1.printList();

    }
}
