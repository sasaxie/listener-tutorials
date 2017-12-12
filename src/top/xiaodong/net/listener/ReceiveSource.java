package top.xiaodong.net.listener;

import java.util.Enumeration;
import java.util.Vector;

public class ReceiveSource {
    private Vector repository = new Vector();

    public ReceiveSource() {}

    // 添加监听
    public void addNetListener(ReceiveListener listener) {
        repository.addElement(listener);
    }

    // 当被监听者触发时调用，通知监听者
    public void notifyNetEvent(ReceiveMessage message) {
        Enumeration enumeration = repository.elements();
        while (enumeration.hasMoreElements()) {
            ReceiveListener listener = (ReceiveListener) enumeration.nextElement();
            listener.handleEvent(new ReceiveEvent(message));
        }
    }
}
