package com.blog.cavalr.web.mail;

import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext.xml"})
public class EmailSenderTest {

    @Autowired
    private EmailSender emailSender;
    @Autowired
    private VelocityEngine velocityEngine;

    @Test
    public void testSendEmail() throws Exception {
        emailSender.sendEmail("baljit.garcha@cavalr.com", "baljit.garcha@cavalr.com", "Test");
    }

    @Test
    public void testSendEmailWithAttachment() throws Exception {
        emailSender.sendEmailWithAttachment("baljit.garcha@cavalr.com", "baljit.garcha@cavalr.com", "Test",
                "attachment.txt", "attachment.txt");
    }}
