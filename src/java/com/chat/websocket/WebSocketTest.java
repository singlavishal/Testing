/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.websocket;

/**
 *
 * @author Kunal
 */
import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class WebSocketTest {

  @OnMessage
  public void onMessage(String message, Session session) 
    throws IOException, InterruptedException {
      System.out.println(session);
    // Print the client message for testing purposes
    System.out.println("Received: " + message);
  
    // Send the first message to the client
    for(Session ses:session.getOpenSessions()){
        ses.getBasicRemote().sendText(message);
    }
    //session.getBasicRemote().sendText(message);
  
    // Send 3 messages to the client every 5 seconds
    int sentMessages = 0;
    /*while(sentMessages < 3){
      Thread.sleep(5000);
      session.getBasicRemote().
        sendText("This is an intermediate server message. Count: " 
          + sentMessages);
      sentMessages++;
    }*/
  
    // Send a final message to the client
    //session.getBasicRemote().sendText("This is the last server message");
  }
  
  @OnOpen
  public void onOpen() {
    System.out.println("Client connected");
  }

  @OnClose
  public void onClose() {
    System.out.println("Connection closed");
  }
}