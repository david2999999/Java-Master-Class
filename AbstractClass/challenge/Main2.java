package AbstractClass.challenge;

public class Main2 {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);

        String stringData = "5 4 2 1 123 2 3 4 1 2 4 5 2";
        String[] data = stringData.split(" ");
        for (String s: data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
    }
}
