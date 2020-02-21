package com.bridgelabz.behavioral.mediator.chat;

/**Title:Mediator Design Pattern
 * Program to show the use of Mediator design pattern
 * Client and User Chatting
 *
 */
public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Krunal");
		User user2 = new UserImpl(mediator, "Ankit");
		User user3 = new UserImpl(mediator, "Vishal");
		User user4 = new UserImpl(mediator, "Vicky");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");

	}

}