package org.messenger.tutorialsports;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.messenger.tutorialsports.model.Message;
import org.messenger.tutorialsports.service.MessageService;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	  MessageService messageService = new MessageService();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <Message>  getAllMessages() {
        return  messageService.getAllMessage();
    }
	
	@GET
	@Path("/{messageId}")
	@Produces( MediaType.APPLICATION_JSON )
	public Message getMessage(@PathParam("messageId")long id ){
		return  messageService.getMessage(id);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return messageService.addMesssage(message);
	}
	


	@PUT
	@Path("/{messageId}")
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId")long id ,Message message ){
		message.setId(id);
		return  messageService.updateMessage(message);
	}
	
	
	@DELETE
	@Path("/{messageId}")
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId")long id  ){
	
		messageService.removeMessage(id);
	}
	
	
	
	
	
	
	
	
	
	

	}
