package com.example.SendingEmail.service;

import com.example.SendingEmail.Entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
