package examples.phone;

public class Phone {

    private int screen;
    private boolean touchStatus;
    private boolean wifiStatus;
    private int phoneCalls;
    private int phoneMessages;

    public Phone() {
    }

    public Phone(int screen, boolean touchStatus, boolean wifiStatus) {
        this.screen = screen;
        this.touchStatus = touchStatus;
        this.wifiStatus = wifiStatus;
        phoneCalls = 0;
        phoneMessages = 0;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public boolean isTouchStatus() {
        return touchStatus;
    }

    public void setTouchStatus(boolean touchStatus) {
        this.touchStatus = touchStatus;
    }

    public boolean isWifiStatus() {
        return wifiStatus;
    }

    public void setWifiStatus(boolean wifiStatus) {
        this.wifiStatus = wifiStatus;
    }

    public void call(String phoneNumber) {
        System.out.println(String.format("call on %s number from %s",
                phoneNumber, this.getClass().getCanonicalName()));
        phoneCalls++;
    }

    public void sendMessage(String phoneNumber, String textMessage) {
        System.out.println(String.format("send message on %s with text < %s > from %s",
                phoneNumber, textMessage, this.getClass().getCanonicalName()));
        phoneMessages++;
    }

    public int getPhoneCalls() {
        return phoneCalls;
    }

    public int getPhoneMessages() {
        return phoneMessages;
    }
}
