package com.example.schooljobfind.Common.component;

import com.example.schooljobfind.Common.entity.ChatMessage;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;
import sun.plugin2.message.Message;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.HashMap;
import java.util.Map;

@ServerEndpoint(value = "/chat/{userid}")
@Component
public class WebSocketService {


    /**
     * 记录当前在线连接数
     */
    public static final Map<Integer, Session> sessionMap = new HashMap<>();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("userid") Integer userid) {
        sessionMap.put(userid,session);
        System.out.println("ID为:"+userid+"的用户进入系统");
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(Session session, @PathParam("userid") Integer userid) {
        sessionMap.remove(userid);
        System.out.println("ID为:"+userid+"的用户离开系统");

    }

    /**
     * 收到客户端消息后调用的方法
     * 后台收到客户端发送过来的消息
     * onMessage 是一个消息的中转站
     * 接受 浏览器端 socket.send 发送过来的 json数据
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session, @PathParam("userid") Integer userid) {
        System.out.println(message);
        JSONObject jsonObject = JSONObject.fromObject(message);
        ChatMessage cm = new ChatMessage(userid,(String)jsonObject.get("msg"),(String) jsonObject.get("sender"),(Integer) jsonObject.get("touserid"));
        Session toSession = sessionMap.get(cm.getTouserid());
        sendMessage(message,toSession);

    }

    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

    /**
     * 服务端发送消息给客户端
     */
    private void sendMessage(String message, Session toSession) {
        try {
            toSession.getBasicRemote().sendText(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 服务端发送消息给所有客户端
     */
//    private void sendAllMessage(String message) {
//        try {
//            for (Session session : sessionMap.values()) {
//                //System.out.println("服务器发送数据给"+session.getId());
//                session.getBasicRemote().sendText(message);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}