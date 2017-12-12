package top.xiaodong.net.listener;

public class ListenerTest {
    public static void main(String[] args) {
        ReceiveSource source = new ReceiveSource();

        // 注册监听 transaction
        source.addNetListener((ReceiveEvent event) -> {
            if (event.getMessage().getType() == ReceiveMessageType.TRANSACTION) {
                event.receiveBlock(event.getMessage().getMessage());
            }
        });

        // 注册监听 block
        source.addNetListener((ReceiveEvent event) -> {
            if (event.getMessage().getType() == ReceiveMessageType.BLOCK) {
                event.receiveBlock(event.getMessage().getMessage());
            }
        });

        ReceiveMessage message = new ReceiveMessage();
        message.setType(ReceiveMessageType.BLOCK);
        message.setMessage("block");

        source.notifyNetEvent(message);

        message.setType(ReceiveMessageType.TRANSACTION);
        message.setMessage("transaction");

        source.notifyNetEvent(message);
    }
}
