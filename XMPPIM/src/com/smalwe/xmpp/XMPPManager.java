package com.smalwe.xmpp;

import java.io.IOException;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

public class XMPPManager {
	

	public static void main(String args[]) throws SmackException, IOException, XMPPException {
		XMPPTCPConnectionConfiguration.Builder configBuilder = XMPPTCPConnectionConfiguration.builder();
		configBuilder.setUsernameAndPassword("testuser1", "dodo@123");
		//configBuilder.setResource("SomeResource");
		configBuilder.setServiceName("localhost");
		configBuilder.setPort(5222);
		configBuilder.setSecurityMode(SecurityMode.disabled);

		
		AbstractXMPPConnection connection = new XMPPTCPConnection
												(configBuilder.build());
		
		connection.connect();
		System.out.println("XMPP connected: " + connection.isConnected());
		System.out.println("XMPP Host:" +  connection.getHost());
		//System.out.println("XMPP User:" +  connection.getUser());
		 connection.login();
		System.out.println("XMPP User:" +  connection.getUser());
		System.out.println("XMPP Authentication:" +  connection.isAuthenticated());
		 
		ChatManager cm = ChatManager.getInstanceFor(connection);
		Chat newChat = cm.createChat("testuser2@localhost.localdomain", 
				new ChatMessageListener() {
			

			@Override
			public void processMessage(Chat chat, Message message) {
				System.out.println("Receviced message:" +message);
				
			}
		});
		
		//Chat newChat = cm.createChat(("testuser2@localhost.localdomain");
		newChat.sendMessage("Hello");
		
		//connection.disconnect();
	}
	
}
