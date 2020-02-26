package observer;

public class Button {

    public void push(RollingGate rollingGate) {
        if(rollingGate.isOpened()) {
            rollingGate.close();
        } else {
            rollingGate.open();
        }
    }
}
