package AbstractClass.challenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "5 4 2 1 123 2 3 4 1 2 4 5 2";
        String[] data = stringData.split(" ");
        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

    }
}
