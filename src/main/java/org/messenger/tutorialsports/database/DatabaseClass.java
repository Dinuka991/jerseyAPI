package org.messenger.tutorialsports.database;
import java.util.HashMap;
import java.util.Map;

import org.messenger.tutorialsports.model.Message;

public class DatabaseClass {
	

	private static Map<Long , Message > messages = new HashMap<>();
	
	public static Map<Long , Message > getMessages(){
		return messages;
	}
	
	

}
