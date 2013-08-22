package com.ebay.build.email;


import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.BodyPart;




public class MailSenderInfo {
	
	//the server IP and port of sending mail
	private String mailServerHost;
	private String mailServerPort = "25";
	
	//mail sender 
	private String fromAddress;
	
	//mail recipient
	private String toAddress;
	
	//the user name and password of mailbox
	private String userName;
	private String password;
	
	//the authentication
	private boolean validate;
	
	//the subject of mail
	private String subject;
	
	//the content of mail
	private String content;
	
	private String contentType =  "text/html;charset=utf-8";
	
	//the name of mail attachment
	private String[] attachFileNames;
	
	private String mimepartMethod;
	
	private List<BodyPart> bodyParts = new ArrayList<BodyPart>();
	

	/**
	 * 
	 * @return Properties
	 */
	public Properties getProperties(){
		
		
		Properties props = new Properties();
	    props.put("mail.smtp.host", this.mailServerHost);    
        props.put("mail.smtp.port", this.mailServerPort);      
        props.put("mail.smtp.auth", validate ? true : false);
        return props;
        
	}
	
	

	public String getMailServerHost() {
		return mailServerHost;
	}

	public void setMailServerHost(String mailServerHost) {
		this.mailServerHost = mailServerHost;
	}

	public String getMailServerPort() {
		return mailServerPort;
	}

	public void setMailServerPort(String mailServerPort) {
		this.mailServerPort = mailServerPort;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getAttachFileNames() {
		return attachFileNames;
	}

	public void setAttachFileNames(String[] attachFileNames) {
		this.attachFileNames = attachFileNames;
	}



	public String getContentType() {
		return contentType;
	}



	public void setContentType(String contentType) {
		this.contentType = contentType;
	}



	public String getMimepartMethod() {
		return mimepartMethod;
	}



	public void setMimepartMethod(String mimepartMethod) {
		this.mimepartMethod = mimepartMethod;
	}
	
	
	public List<BodyPart> getBodyParts() {
		return this.bodyParts;
	}

}
