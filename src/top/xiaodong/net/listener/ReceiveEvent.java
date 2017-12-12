package top.xiaodong.net.listener;

public class ReceiveEvent {
    private ReceiveMessage message;

    public ReceiveEvent() {}

    public ReceiveEvent(ReceiveMessage message) {
        this.message = message;
    }

    // 网络事件：接收消息
    public void receiveBlock(String message) {
        System.out.println(message);
    }

    public void receiveTransaction(String message) {
        System.out.println(message);
    }

    public ReceiveMessage getMessage() {
        return message;
    }

    public void setMessage(ReceiveMessage message) {
        this.message = message;
    }
}
