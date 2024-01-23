package com.example.demoemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootApplication
public class DemoEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEmailApplication.class, args);

		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("namgaxilem@gmail.com");
		mailSender.setPassword("nfnl jetb fdax eyay");

		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("noreply@baeldung.com");
		message.setTo("ndnam@tma.com.vn");
		message.setSubject("Nam test noti subject");
		message.setText("Name test content.");
		mailSender.send(message);
	}

}
