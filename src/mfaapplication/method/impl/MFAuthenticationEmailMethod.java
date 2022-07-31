/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfaapplication.method.impl;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import mfaapplication.method.SecurityCode;
import mfaapplication.method.MFAuthenticationMethod;
import mfaapplication.service.AuthenticationService;

/**
 *
 * @author naozeb
 */
public class MFAuthenticationEmailMethod extends SecurityCode implements MFAuthenticationMethod<Boolean, Integer> {

    private static final Logger LOGGER = Logger.getLogger(MFAuthenticationEmailMethod.class.getName());

    /**
     *
     * @return
     */
    @Override
    public Boolean send() {

        try {
            String host = "smtp.gmail.com";
            String port = "587";
            String userName = "";  //Your Email
            String password = ""; //Your EmailPassword
            String toAddress = AuthenticationService.getInstance().getUser().getEmail();
            String subject = "Authentication";
            String message = "Your Security Code Is " + generateSecurityCode();
            LOGGER.info(message);
            Properties properties = new Properties();
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", port);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            properties.put("mail.smtp.starttls.enable", "true");
            // *** BEGIN CHANGE
            properties.put("mail.smtp.user", userName);

            // creates a new session, no Authenticator (will connect() later)
            Session session = Session.getDefaultInstance(properties);
            // *** END CHANGE

            // creates a new e-mail message
            Message msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(userName));
            InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
            msg.setRecipients(Message.RecipientType.TO, toAddresses);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            // set plain text message
            msg.setText(message);

            try ( // *** BEGIN CHANGE
                    // sends the e-mail
                     Transport t = session.getTransport("smtp")) {
                t.connect(host, userName, password);
                t.sendMessage(msg, msg.getAllRecipients());
            }
            return true;
            // *** END CHANG
        } catch (MessagingException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean verify(Integer u) {
        return securityCode == u;
    }
}
