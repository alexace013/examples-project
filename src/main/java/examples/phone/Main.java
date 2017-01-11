package examples.phone;

public class Main {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone(5, true, true);
        iPhone.call("555-555-555");
        System.out.println("iphone calls = " + iPhone.getPhoneCalls());
        iPhone.call("555-555-555");
        iPhone.call("555-555-555");
        iPhone.call("555-555-555");
        iPhone.call("555-555-555");
        System.out.println("iphone calls = " + iPhone.getPhoneCalls());

        Samsung samsung = new Samsung(4, true, false);
        samsung.call("555-555-555");
        System.out.println("samsung calls = " + samsung.getPhoneCalls());
        for (int i = 0; i <= 10; i++) {
            samsung.call("555-555-555");
        }
        System.out.println("samsung calls = " + samsung.getPhoneCalls());

        samsung.sendMessage("555-555-555", "what's up?");
        System.out.println("samsung messages = " + samsung.getPhoneMessages());
    }

}
