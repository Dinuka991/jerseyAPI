package org.messenger.tutorialsports.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	//public Message(long i, String string, Date date, String string2){}

	private long id ;
    private String message ;
    private Date date ;
    private String auther ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Message(long id, String message,Date date ,String auther) {
		super();
		this.id = id;
		this.message = message;
		this.date = date;
		this.auther = auther;
	}
    public Message(){
    	
    }
    
    
	
	
}
