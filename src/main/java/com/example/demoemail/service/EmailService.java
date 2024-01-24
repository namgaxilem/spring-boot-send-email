package com.example.demoemail.service;

import jakarta.mail.MessagingException;
import org.thymeleaf.context.Context;

public interface EmailService {
    void sendEmail(String to, String subject, String body);

    void sendEmailWithHtmlTemplate(String to, String subject, String templateName, Context context) throws MessagingException;
}
