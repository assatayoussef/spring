package com.location.location.util;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

// we use the JavaMailSender

@Component
public class EmailSender implements EmailSenderInterface {
	@Autowired
  private JavaMailSender javaMailSender;
//	@Override
//	public void sendEmail(String toAdress, String subject, String body) {
//		MimeMessage message = sender.createMimeMessage();
//		sender.send(message);
//		MimeMessageHelper helper = new MimeMessageHelper(message);
//		try {
//			helper.setTo(toAdress);
//			helper.setTo(subject);
//			helper.setTo(subject);
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

    @Autowired
    public EmailSender (JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    @Override
    public void send (String receiver, String sender, String message, String filenameAndLocation) {
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            @Override
            public void prepare (MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
                messageHelper.setTo(receiver);
                messageHelper.setFrom(sender);
                messageHelper.setSubject("test subject");
                messageHelper.setText(message);
            }
        };
        this.javaMailSender.send(preparator);
    }




}
