package com.location.location.util;

public interface EmailSenderInterface {
//	 void sendEmail(String toAdress, String subject , String body);

	void send(String receiver, String sender, String message, String filenameAndLocation);
}
