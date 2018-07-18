package com.halalwallpaper.halalwallpaper.resources;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wps")
public class Wps {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getWp() {

//		File folder = new File(".");
//		File[] files = folder.listFiles();
		
		
		URL resource = Wps.class.getResource("wps");
		try {
			System.out.println(new File(resource.toURI()).getAbsolutePath());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
//		System.out.println(files);
//		File renamed= null;
//		    for (int i = 0; i < files.length; i++) {
//		      if (files[i].isFile()) {
//		    	  renamed= new File(files[i].getAbsoluteFile()+""+i+".jpg");
//		    	  files[i].renameTo(renamed);
//		      } 
//		    }
		    return "hjj";
	}


}
