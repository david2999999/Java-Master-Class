package InnerInterface;

public class Main2 {
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Title was clicked");
            }
        });
    }
}
