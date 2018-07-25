package Interface;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(123123);

        myPhone.powerOn();
        myPhone.callPhone(123123);
        myPhone.answer();
    }
}
