package com.example.mblog.ws;

import com.example.mblog.config.WebsocketConfig;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.awt.event.WindowFocusListener;


@ServerEndpoint(value = "/chat",configurator= WebsocketConfig.class)
@Component
public class MyWebsocket {
    private HttpSession httpSession;
    @OnOpen
    public void onOpen(Session session, EndpointConfig config) {
        HttpSession httpSession = (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        String username = (String) httpSession.getAttribute("user");
        System.out.println(username);

    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(message);
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("12312");
    }
    }

