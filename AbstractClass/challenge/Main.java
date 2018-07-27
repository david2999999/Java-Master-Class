package AbstractClass.challenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "1 2 3 0 5 4 6 7 8 9";
        String[] data = stringData.split(" ");
        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

    }
}
