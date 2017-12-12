package top.xiaodong.net.listener;

public class ReceiveMessage {
    private ReceiveMessageType type;
    private String message;

    public ReceiveMessage() {}

    public ReceiveMessageType getType() {
        return type;
    }

    public void setType(ReceiveMessageType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
