package com.halalwallpaper.halalwallpaper;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.halalwallpaper.model.Message;

@Path("/messages")
public class MessageResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message[] getMessages() {
		
		Message m1= new Message("haris", 24);
		Message m2= new Message("Imran", 25);
		Message m3= new Message("Younis", 26);
		Message m4= new Message("Feroz", 21);
		Message m5= new Message("Giran", 14);
		Message m[] = { m1, m2, m3, m4, m5
	};
		return m;
	}

}
