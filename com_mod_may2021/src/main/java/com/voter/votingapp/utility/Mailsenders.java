package com.voter.votingapp.utility;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Mailsenders {

	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl =new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("varalakshmi.xworkz@gmail.com");
		mailSenderImpl.setPassword("Vara@1234");
		
		Properties javaMailProperties =new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		
		mailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs= {"nvaralakshmi854@gmail.com"};
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("varalakshmi.xworkz@gmail.com");
		message.setTo("kmchethan01@gmail.com");
		message.setCc("chuchilreddy@gmail.com");
		message.setBcc(bccs);
		message.setSubject("demo java mailsender");
		message.setText("Hello all \n Varalakshmi this side \n This is demo mail for java mailsender \n thanks and regards \n varalakshmi");
		
		mailSenderImpl.send(message);
	}

}
