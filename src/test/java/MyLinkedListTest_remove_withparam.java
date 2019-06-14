public class MyLinkedListTest_remove_withparam {
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
        System.out.println("remove element: "+myLinkedList.remove(1));
        myLinkedList.printList();

        System.out.println("remove element: "+myLinkedList.remove(0));
        myLinkedList.printList();

        System.out.println("remove element: "+myLinkedList.remove(4));
        myLinkedList.printList();


    }
}