public class MyLinkedListTest_add_withparam {
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

        myLinkedList.printList();
    }
}
