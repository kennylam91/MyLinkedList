public class MyLinkedListTest_addLast {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<String> myLinkedList= new MyLinkedList<>();
        myLinkedList.addLast("mot");
        myLinkedList.addLast("hai");
        myLinkedList.addLast("ba");
        myLinkedList.addLast("bon");
        myLinkedList.printList();
    }
}
