package examples.phone;

public class IPhone extends Phone {

    public IPhone() {
    }

    public IPhone(int screen, boolean touchStatus, boolean wifiStatus) {
        super(screen, touchStatus, wifiStatus);
    }

    @Override
    public void call(String phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void sendMessage(String phoneNumber, String textMessage) {
        super.sendMessage(phoneNumber, textMessage);
    }
}
