package org.messenger.tutorialsports.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.messenger.tutorialsports.model.Message;
import org.messenger.tutorialsports.database.DatabaseClass;


public class MessageService {
	
	
	
	
	
	
	
	public Map <Long , Message > messages =
				DatabaseClass.getMessages();
	
	
	
		
	public MessageService()
	{
	 messages.put(1L, new Message(1,"wge",null, "dfgs"));
	 messages.put(2L, new Message(2,"ddwge",null, "dd3333dfgs"));
	 
	}
	public ArrayList<Message> getAllMessage()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	
	public Message getMessage(long id){
		    
		return messages.get(id);
		
	}
 
	
	public Message addMesssage( Message message ){
    
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message ;
    
	
	}
	
	
	
	
	
	public Message updateMessage(Message message ){
		if ( message.getId() <= 0 )
		{
			return null ;
		}
		else 
	     	{
			messages.put( message.getId() , message );
			
			return message ;
			}
		
	}
	
	public Message  removeMessage(long id){
		return messages.remove(id);
	 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
//		List <Message> list = new ArrayList<>();
//		Message m1 =  new Message (2,"sss", null, "aaa" );
//	    Message m2 =  new Message (2 ,"ss" , null, "ss");
//		
//	    list.add(m1);
//		list.add(m2);
//		return list ;
//		
	}


