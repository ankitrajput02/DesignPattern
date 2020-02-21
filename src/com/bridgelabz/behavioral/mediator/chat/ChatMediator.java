package com.bridgelabz.behavioral.mediator.chat;

/**
 * interface ChatMediator
 *
 */
public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}
